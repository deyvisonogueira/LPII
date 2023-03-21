package model;

public class Veiculo {
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    
    public Veiculo(String modelo, String ano, String cor, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    } 

}
