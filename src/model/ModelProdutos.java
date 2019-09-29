package model;

public class ModelProdutos {

    private int idProduto;
    private int ProdutoiD;
    private String proNome;
    private Double proValor;
    private int proEstoque;

    public int getProdutoiD() {
        return ProdutoiD;
    }

    public void setProdutoiD(int ProdutoiD) {
        this.ProdutoiD = ProdutoiD;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }
}
