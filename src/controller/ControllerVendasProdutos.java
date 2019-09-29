package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    public ModelVendasProdutos getVendasProdutosController(int pIdVendaProduto) {
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController() {
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    public boolean excluirVendasProdutosController(int pIdVendaProduto) {
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutos);
    }
}
