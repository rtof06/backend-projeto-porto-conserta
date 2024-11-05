package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.fiap.beans.User;
import br.com.fiap.dao.UserDAO;

public class UserBO {

    public Optional<User> verificarCredenciais(String email, String password) throws ClassNotFoundException, SQLException {
        UserDAO userDAO = new UserDAO();
        return userDAO.verificarCredenciais(email, password);
    }

    public List<User> listarTodosUsuarios() throws ClassNotFoundException, SQLException {
        UserDAO userDAO = new UserDAO();
        return userDAO.listarTodosUsuarios();
    }
}
