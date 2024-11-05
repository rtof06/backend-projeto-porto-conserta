package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.Servico;
import br.com.fiap.dao.ServicoDAO;

public class ServicoBO {
    private ServicoDAO dao;

    public ServicoBO() throws ClassNotFoundException, SQLException {
        this.dao = new ServicoDAO();
    }

    public String cadastrarServicos(Servico servico) {
        try {
            return dao.inserir(servico);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao cadastrar Servico: " + e.getMessage();
        }
    }

    public String deletarServicos(int id) {
        try {
            return dao.deletar(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao deletar Centro Automotivo: " + e.getMessage();
        }
    }

    public String atualizarServicos(Servico servico) {
        try {
            return dao.atualizar(servico);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao atualizar Servico: " + e.getMessage();
        }
    }

    public List<Servico> listarTodosServicos() {
        try {
            return dao.selecionarTodos();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
