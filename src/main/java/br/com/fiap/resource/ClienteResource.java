package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

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

import br.com.fiap.beans.Cliente;
import br.com.fiap.bo.ClienteBO;

@Path("/clientes")
public class ClienteResource {
	private ClienteBO clienteBO;

	public ClienteResource() throws ClassNotFoundException, SQLException {
		this.clienteBO = new ClienteBO();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response cadastrarCliente(Cliente cliente) {
		try {
			String resultado = clienteBO.cadastrarCliente(cliente);
			return Response.ok(resultado).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Erro ao cadastrar cliente: " + e.getMessage()).build();
		}
	}

	@DELETE
	@Path("/{codigo}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response deletarCliente(@PathParam("codigo") int codigo) {
		try {
			String resultado = clienteBO.deletarCliente(codigo);
			return Response.ok(resultado).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Erro ao deletar cliente: " + e.getMessage()).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response atualizarCliente(Cliente cliente) {
		try {
			String resultado = clienteBO.cadastrarCliente(cliente);
			return Response.ok(resultado).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Erro ao atualizar cliente: " + e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodosClientes() {
		try {
			List<Cliente> lista = clienteBO.listarTodosClientes();
			return Response.ok(lista).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Erro ao listar clientes: " + e.getMessage()).build();
		}
	}

	@GET
	@Path("/email/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response selecionarPorEmail(@PathParam("email") String email) {
		try {
			Optional<Cliente> cliente = clienteBO.selecionarPorEmail(email);
			if (cliente.isPresent()) {
				return Response.ok(cliente.get()).build();
			} else {
				return Response.status(Response.Status.NOT_FOUND).entity("Cliente não encontrado").build();
			}
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Erro ao buscar cliente: " + e.getMessage()).build();
		}
	}
}
