package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.CentroAutomotivo;
import br.com.fiap.dao.CentroAutomotivoDAO;

public class CentroAutomotivoBO {
    private CentroAutomotivoDAO dao;

    public CentroAutomotivoBO() throws ClassNotFoundException, SQLException {
        this.dao = new CentroAutomotivoDAO();
    }

    public String cadastrarCentroAutomotivo(CentroAutomotivo centro) {
        try {
            return dao.inserir(centro);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao cadastrar Centro Automotivo: " + e.getMessage();
        }
    }

    public String deletarCentroAutomotivo(int id) {
        try {
            return dao.deletar(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao deletar Centro Automotivo: " + e.getMessage();
        }
    }

    public String atualizarCentroAutomotivo(CentroAutomotivo centro) {
        try {
            return dao.atualizar(centro);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao atualizar Centro Automotivo: " + e.getMessage();
        }
    }

    public List<CentroAutomotivo> listarTodosCentrosAutomotivos() {
        try {
            return dao.selecionarTodos();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
