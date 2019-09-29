package model;

public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliUf;
    private String cliCep;
    private String cliTelefone;

    public ModelCliente() {
    }
    
    public void setIdCliente(int pIdCliente) {
        this.idCliente = pIdCliente;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setCliNome(String pCliNome) {
        this.cliNome = pCliNome;
    }
    
    public String getCliNome() {
        return this.cliNome;
    }
    
    public void setCliEndereco(String pCliEndereco) {
        this.cliEndereco = pCliEndereco;
    }
    
    public String getCliEndereco() {
        return this.cliEndereco;
    }
    
    public void setCliBairro(String pCliBairro) {
        this.cliBairro = pCliBairro;
    }
    
    public String getCliBairro() {
        return this.cliBairro;
    }
    
    public void setCliCidade(String pCliCidade) {
        this.cliCidade = pCliCidade;
    }
    
    public String getCliCidade() {
        return this.cliCidade;
    }
    
    public void setCliUf(String pCliUf) {
        this.cliUf = pCliUf;
    }
    
    public String getCliUf() {
        return this.cliUf;
    }
    
    public void setCliCep(String pCliCep) {
        this.cliCep = pCliCep;
    }
    
    public String getCliCep() {
        return this.cliCep;
    }
    
    public void setCliTelefone(String pCliTelefone) {
        this.cliTelefone = pCliTelefone;
    }
    
    public String getCliTelefone() {
        return this.cliTelefone;
    }

    @Override
    public String toString() {
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliEndereco = " + this.cliEndereco + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliUf = " + this.cliUf + "::cliCep = " + this.cliCep + "::cliTelefone = " + this.cliTelefone + "}";
    }
}
