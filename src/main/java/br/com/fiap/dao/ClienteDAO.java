package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {

	public Connection minhaConexao;

	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Insert
	public String inserir(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTES (cod_cliente, nome, sobrenome, idade, email, telefone, num_logradouro, comp_logradouro, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        stmt.setInt(1, cliente.getCodigo());
        stmt.setString(2, cliente.getNome());
        stmt.setString(3, cliente.getSobrenome());
        stmt.setInt(4, cliente.getIdade());
        stmt.setString(5, cliente.getEmail());
        stmt.setString(6, cliente.getTelefone());
        stmt.setInt(7, cliente.getNumLogradouro());
        stmt.setString(8, cliente.getCompLogradouro());
        stmt.setString(9, cliente.getPassword());
        stmt.execute();
        stmt.close();
        return "Cadastrado com Sucesso!";
    }

	// Delete
	public String deletar(int codigo) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from CLIENTES where cod_cliente = ?");
		stmt.setInt(1, codigo);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// Update
	public String atualizar(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				" Update CLIENTES set NOME = ?, SOBRENOME = ?,  IDADE = ?, CPF = ?, PASSWORD = ? where COD_CLIENTE = ?");
		stmt.setInt(1, cliente.getCodigo());
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getSobrenome());
		stmt.setInt(4, cliente.getIdade());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Cliente> selecionar() throws SQLException {
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM CLIENTES");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setCodigo(rs.getInt(1));
			cliente.setNome(rs.getString(2));
			cliente.setSobrenome(rs.getString(3));
			cliente.setIdade(rs.getInt(4));
			cliente.setEmail(rs.getString(5));
			cliente.setTelefone(rs.getString(6));
			cliente.setNumLogradouro(rs.getInt(7));
			cliente.setCompLogradouro(rs.getString(8));
			cliente.setPassword(rs.getString(9));
			listaCliente.add(cliente);
		}
		return listaCliente;
	}

	public Optional<Cliente> selecionarPorEmail(String email) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM CLIENTES WHERE EMAIL = ?");
		stmt.setString(1, email);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setCodigo(rs.getInt("COD_CLIENTE"));
			cliente.setNome(rs.getString("NOME"));
			cliente.setSobrenome(rs.getString("SOBRENOME"));
			cliente.setIdade(rs.getInt("IDADE"));
			cliente.setPassword(rs.getString("PASSWORD"));
			return Optional.of(cliente);
		}

		return Optional.empty();
	}
}
