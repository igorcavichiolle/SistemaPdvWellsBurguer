package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    public int salvarClienteController(ModelCliente pModelCliente) {
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    public ModelCliente getClienteController(int pIdCliente) {
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    public ModelCliente getClienteController(String pNomeCliente) {
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }

    public ArrayList<ModelCliente> getListaClienteController() {
        return this.daoCliente.getListaClienteDAO();
    }

    public boolean atualizarClienteController(ModelCliente pModelCliente) {
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    public boolean excluirClienteController(int pIdCliente) {
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}
