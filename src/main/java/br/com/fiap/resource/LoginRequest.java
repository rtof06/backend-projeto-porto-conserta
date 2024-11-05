package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.beans.User;
import br.com.fiap.bo.UserBO;

@Path("/login")
public class LoginRequest {
    private UserBO userBO;

    public LoginRequest() throws ClassNotFoundException, SQLException {
        this.userBO = new UserBO();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(User user) {
        try {
            Optional<User> authenticatedUser = userBO.verificarCredenciais(user.getEmail(), user.getPassword());

            if (authenticatedUser.isPresent()) {
                return Response.ok("{\"success\": true, \"message\": \"Login successful\"}").build();
            } else {
                return Response.status(Response.Status.UNAUTHORIZED)
                        .entity("{\"success\": false, \"message\": \"Invalid credentials\"}").build();
            }
        } catch (SQLException | ClassNotFoundException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("{\"success\": false, \"message\": \"Database error\"}").build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarUsuarios() {
        try {
            List<User> users = userBO.listarTodosUsuarios();
            return Response.ok(users).build();
        } catch (SQLException | ClassNotFoundException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("{\"success\": false, \"message\": \"Database error\"}").build();
        }
    }
}
