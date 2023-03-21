package model;

public class Funcionario {
    private String nome;
    private String cargo;
    private String dataAdimissão; 
    private boolean ativo; 
    private double salario;

    public Funcionario(String nome, String cargo, String dataAdimissão, boolean ativo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataAdimissão = dataAdimissão;
        this.ativo = ativo;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdimissão() {
        return dataAdimissão;
    }

    public void setDataAdimissão(String dataAdimissão) {
        this.dataAdimissão = dataAdimissão;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
