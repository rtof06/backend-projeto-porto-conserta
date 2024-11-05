package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {

    public String cadastrarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.inserir(cliente);
    }

    public String deletarCliente(int codigo) throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.deletar(codigo);
    }

    public String atualizarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.atualizar(cliente);
    }

    public List<Cliente> listarTodosClientes() throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.selecionar();
    }

    public Optional<Cliente> selecionarPorEmail(String email) throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.selecionarPorEmail(email);
    }
}
