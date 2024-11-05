package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.fiap.beans.User;
import br.com.fiap.conexoes.ConexaoFactory;

public class UserDAO {

    private Connection minhaConexao;

    public UserDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Verificar credenciais do usuário
    public Optional<User> verificarCredenciais(String email, String password) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM CLIENTES WHERE EMAIL = ? AND PASSWORD = ?");
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            User user = new User();
            user.setEmail(rs.getString("EMAIL"));
            user.setPassword(rs.getString("PASSWORD"));
            return Optional.of(user);
        }

        return Optional.empty();
    }

    // Listar todos os usuários
    public List<User> listarTodosUsuarios() throws SQLException {
        List<User> users = new ArrayList<>();
        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT COD_CLIENTE, EMAIL, PASSWORD FROM CLIENTES");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            User user = new User();
            user.setEmail(rs.getString("EMAIL"));
            user.setPassword(rs.getString("PASSWORD"));
            users.add(user);
        }

        return users;
    }
}
