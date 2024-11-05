package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.CentroAutomotivo;
import br.com.fiap.conexoes.ConexaoFactory;

public class CentroAutomotivoDAO {
	private Connection minhaConexao;

	public CentroAutomotivoDAO() throws ClassNotFoundException, SQLException {
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	public String inserir(CentroAutomotivo centro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"INSERT INTO CENTROS_AUTOMOTIVOS (ID, NAME, NEIGHBOURHOOD, STREET, PHONE, UF, CITY, ATENDIMENTO) VALUES (?,?,?,?,?,?,?,?)");

		stmt.setInt(1, centro.getId());
		stmt.setString(2, centro.getName());
		stmt.setString(3, centro.getNeighbourhood());
		stmt.setString(4, centro.getStreet());
		stmt.setString(5, centro.getPhone());
		stmt.setString(6, centro.getUf());
		stmt.setString(7, centro.getCity());
		stmt.setString(8, centro.getAtendimento());

		stmt.execute();
		stmt.close();

		return "Centro Automotivo cadastrado com sucesso!";
	}

	public String deletar(int id) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM CENTROS_AUTOMOTIVOS WHERE ID = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();

		return "Centro Automotivo deletado com sucesso!";
	}

	public String atualizar(CentroAutomotivo centro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"UPDATE CENTROS_AUTOMOTIVOS SET NAME = ?, NEIGHBOURHOOD = ?, STREET = ?, PHONE = ?, UF = ?, CITY = ?, ATENDIMENTO = ? WHERE ID = ?");

		stmt.setString(1, centro.getName());
		stmt.setString(2, centro.getNeighbourhood());
		stmt.setString(3, centro.getStreet());
		stmt.setString(4, centro.getPhone());
		stmt.setString(5, centro.getUf());
		stmt.setString(6, centro.getCity());
		stmt.setString(7, centro.getAtendimento());
		stmt.setInt(8, centro.getId());

		stmt.executeUpdate();
		stmt.close();

		return "Centro Automotivo atualizado com sucesso!";
	}

	public List<CentroAutomotivo> selecionarTodos() throws SQLException {
		List<CentroAutomotivo> listaCentros = new ArrayList<>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM CENTROS_AUTOMOTIVOS");
		ResultSet rs = stmt.executeQuery();
		System.out.println("estou aqui");
		while (rs.next()) {
			System.out.println(rs.getInt("ID"));
			CentroAutomotivo centro = new CentroAutomotivo();
			centro.setId(rs.getInt("ID"));
			centro.setName(rs.getString("NAME"));
			centro.setNeighbourhood(rs.getString("NEIGHBOURHOOD"));
			centro.setStreet(rs.getString("STREET"));
			centro.setPhone(rs.getString("PHONE"));
			centro.setUf(rs.getString("UF"));
			centro.setCity(rs.getString("CITY"));
			centro.setAtendimento(rs.getString("ATENDIMENTO"));
			listaCentros.add(centro);
		}

		return listaCentros;
	}
}
