package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.beans.CentroAutomotivo;
import br.com.fiap.bo.CentroAutomotivoBO;

@Path("/oficinas")
public class CentroAutomotivoResource {
    private CentroAutomotivoBO bo;

    public CentroAutomotivoResource() throws ClassNotFoundException, SQLException {
        this.bo = new CentroAutomotivoBO();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response cadastrarCentroAutomotivo(CentroAutomotivo centro) {
        String resultado = bo.cadastrarCentroAutomotivo(centro);
        return Response.ok(resultado).build();
    }

    @DELETE
    // @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deletarCentroAutomotivo(@PathParam("id") int id) {
        String resultado = bo.deletarCentroAutomotivo(id);
        return Response.ok(resultado).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response atualizarCentroAutomotivo(CentroAutomotivo centro) {
        String resultado = bo.atualizarCentroAutomotivo(centro);
        return Response.ok(resultado).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodosCentrosAutomotivos() {
        List<CentroAutomotivo> lista = bo.listarTodosCentrosAutomotivos();
        return Response.ok(lista).build();
    }
}
