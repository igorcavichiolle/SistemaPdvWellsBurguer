package model;

public class ModelVendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int vendas;
    private double venProValor;
    private int venProQuantidade;
    private String nomeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public ModelVendasProdutos() {
    }

    public void setIdVendaProduto(int pIdVendaProduto) {
        this.idVendaProduto = pIdVendaProduto;
    }

    public int getIdVendaProduto() {
        return this.idVendaProduto;
    }

    public void setProduto(int pProduto) {
        this.produto = pProduto;
    }

    public int getProduto() {
        return this.produto;
    }

    public void setVendas(int pVendas) {
        this.vendas = pVendas;
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setVenProValor(double pVenProValor) {
        this.venProValor = pVenProValor;
    }

    public double getVenProValor() {
        return this.venProValor;
    }

    public void setVenProQuantidade(int pVenProQuantidade) {
        this.venProQuantidade = pVenProQuantidade;
    }

    public int getVenProQuantidade() {
        return this.venProQuantidade;
    }

    @Override
    public String toString() {
        return "ModelVendasProdutos {" + "::idVendaProduto = " + this.idVendaProduto + "::produto = " + this.produto + "::vendas = " + this.vendas + "::venProValor = " + this.venProValor + "::venProQuantidade = " + this.venProQuantidade + "}";
    }
}
