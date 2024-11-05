package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Servico;
import br.com.fiap.conexoes.ConexaoFactory;

public class ServicoDAO {
	private Connection minhaConexao;

	public ServicoDAO() throws ClassNotFoundException, SQLException {
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	public String inserir(Servico servico) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"INSERT INTO SERVICOS (COD_SERVICO, TIPO_SERVICO) VALUES (?,?)");

		stmt.setInt(1, servico.getId());
		stmt.setString(2, servico.getNome());

		stmt.execute();
		stmt.close();

		return "Servico cadastrado com sucesso!";
	}

	public String deletar(int id) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM SERVICOS WHERE ID = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();

		return "Centro Automotivo deletado com sucesso!";
	}

	public String atualizar(Servico servico) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"UPDATE SERVICOS SET COD_SERVICO = ?, TIPO_SERVICO = ? WHERE cod_servico = ?");

		stmt.setInt(1, servico.getId());
		stmt.setString(2, servico.getNome());

		stmt.executeUpdate();
		stmt.close();

		return "Servico atualizado com sucesso!";
	}

	public List<Servico> selecionarTodos() throws SQLException {
		List<Servico> listaServicos = new ArrayList<>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM SERVICOS");
		ResultSet rs = stmt.executeQuery();
		System.out.println("estou aqui");
		while (rs.next()) {
			System.out.println(rs.getInt("COD_SERVICO"));
			Servico servico = new Servico();
			servico.setId(rs.getInt("COD_SERVICO"));
			servico.setNome(rs.getString("TIPO_SERVICO"));
			listaServicos.add(servico);
		}

		return listaServicos;
	}
}
