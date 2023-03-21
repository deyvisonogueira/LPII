package model;

public class Vendas {
    private int id;
    private Funcionario funcVenda;
    private String tipoPagamento;
    private double valor;
    
    public Vendas(int id, Funcionario funcVenda, String tipoPagamento, double valor) {
        this.id = id;
        this.funcVenda = funcVenda;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncVenda() {
        return funcVenda;
    }

    public void setFuncVenda(Funcionario funcVenda) {
        this.funcVenda = funcVenda;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
