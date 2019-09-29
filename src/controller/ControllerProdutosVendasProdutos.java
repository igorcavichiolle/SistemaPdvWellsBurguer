package controller;

import DAO.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

public class ControllerProdutosVendasProdutos {

    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAOController(int pCodigoVenda) {
        return this.dAOProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
}
