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

import br.com.fiap.beans.Servico;
import br.com.fiap.bo.ServicoBO;

@Path("/servicos")
public class ServicoResource {
    private ServicoBO bo;

    public ServicoResource() throws ClassNotFoundException, SQLException {
        this.bo = new ServicoBO();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response cadastrarServico(Servico servico) {
        String resultado = bo.cadastrarServicos(servico);
        return Response.ok(resultado).build();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public Response deletarServico(@PathParam("id") int id) {
        String resultado = bo.deletarServicos(id);
        return Response.ok(resultado).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response atualizarServico(Servico servico) {
        String resultado = bo.atualizarServicos(servico);
        return Response.ok(resultado).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodosServicos() {
        List<Servico> lista = bo.listarTodosServicos();
        return Response.ok(lista).build();
    }
}
