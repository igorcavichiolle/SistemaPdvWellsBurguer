package model;

import java.sql.Date;

public class ModelVendas {

    private int idVenda;
    private int cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private double valorVenSemana;
    private double valorVenDia;
    private double valorVenMes;

    public double getValorVenDia() {
        return valorVenDia;
    }

    public void setValorVenDia(double valorVenDia) {
        this.valorVenDia = valorVenDia;
    }

    public double getValorVenMes() {
        return valorVenMes;
    }

    public void setValorVenMes(double valorVenMes) {
        this.valorVenMes = valorVenMes;
    }

    public double getValorVenSemana() {
        return valorVenSemana;
    }

    public void setValorVenSemana(double valorVenSemana) {
        this.valorVenSemana = valorVenSemana;
    }

    public ModelVendas() {
    }

    public void setIdVenda(int pIdVenda) {
        this.idVenda = pIdVenda;
    }

    public int getIdVenda() {
        return this.idVenda;
    }

    public void setCliente(int pCliente) {
        this.cliente = pCliente;
    }

    public int getCliente() {
        return this.cliente;
    }

    public void setVenDataVenda(Date pVenDataVenda) {
        this.venDataVenda = pVenDataVenda;
    }

    public Date getVenDataVenda() {
        return this.venDataVenda;
    }

    public void setVenValorLiquido(double pVenValorLiquido) {
        this.venValorLiquido = pVenValorLiquido;
    }

    public double getVenValorLiquido() {
        return this.venValorLiquido;
    }

    public void setVenValorBruto(double pVenValorBruto) {
        this.venValorBruto = pVenValorBruto;
    }

    public double getVenValorBruto() {
        return this.venValorBruto;
    }

    public void setVenDesconto(double pVenDesconto) {
        this.venDesconto = pVenDesconto;
    }

    public double getVenDesconto() {
        return this.venDesconto;
    }

    @Override
    public String toString() {
        return "ModelVendas {" + "::idVenda = " + this.idVenda + "::cliente = " + this.cliente + "::venDataVenda = " + this.venDataVenda + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto + "}";
    }
}
