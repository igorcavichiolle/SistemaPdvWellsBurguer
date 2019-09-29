package model;

import java.util.ArrayList;

public class ModelVendasCLiente {

    private ModelVendas modelVendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCLiente> listaModelVendasCLientes;

    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendasCLiente> getListaModelVendasCLientes() {
        return listaModelVendasCLientes;
    }

    public void setListaModelVendasCLientes(ArrayList<ModelVendasCLiente> listaModelVendasCLientes) {
        this.listaModelVendasCLientes = listaModelVendasCLientes;
    }
}
