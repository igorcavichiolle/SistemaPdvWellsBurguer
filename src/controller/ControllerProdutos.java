package controller;

import DAO.DAOProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

public class ControllerProdutos {

    private DAOProdutos daoProdutos = new DAOProdutos();

    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }

    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    public ModelProdutos retornarProdutoController(int pCodigo) {
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }

    public ModelProdutos retornarProdutoController(String pNomeProduto) {
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }

    public ArrayList<ModelProdutos> retornarListaProdutoController() {
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    public ArrayList<ModelProdutos> retornarListaProdutoMaisVendidosController() {
        return this.daoProdutos.retornarListaProdutosMaisVendidosDAO();
    }

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
