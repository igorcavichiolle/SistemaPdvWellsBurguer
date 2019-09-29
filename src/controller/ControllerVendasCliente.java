package controller;

import DAO.DAOVendas;
import DAO.DAOVendasCLiente;
import java.util.ArrayList;
import model.ModelVendasCLiente;

public class ControllerVendasCliente {

    private DAOVendasCLiente dAOVendasCLiente = new DAOVendasCLiente();

    public ArrayList<ModelVendasCLiente> getListaVendasClienteController() {
        return this.dAOVendasCLiente.getListaVendasCLientesDAO();
    }
}
