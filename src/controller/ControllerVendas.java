package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;

public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    public int salvarVendasController(ModelVendas pModelVendas) {
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    public ModelVendas getVendasController(int pIdVenda) {
        return this.daoVendas.getVendasDAO(pIdVenda);
    }

    public ArrayList<ModelVendas> getListaVendasController() {
        return this.daoVendas.getListaVendasDAO();
    }

    public boolean atualizarVendasController(ModelVendas pModelVendas) {
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    public boolean excluirVendasController(int pIdVenda) {
        return this.daoVendas.excluirVendasDAO(pIdVenda);
    } 
    /**
     * GERAR RELATORIO DA VENDA
     * @param codigoVenda
     * @return 
     */
    public boolean gerarRelatorioVenda(int codigoVenda) {
        return this.daoVendas.RelatorioVendaDAO(codigoVenda);
        
    }
    public ModelVendas retornarVendaDiaController(){
        return this.daoVendas.retornarVendaDia();
    }
    
    public ModelVendas retornarVendaSemanaController(){
        return this.daoVendas.retornarVendaSemana();
    }
    public ModelVendas retornarVendaMesController(){
        return this.daoVendas.retornarVendaMes();
    }
}
