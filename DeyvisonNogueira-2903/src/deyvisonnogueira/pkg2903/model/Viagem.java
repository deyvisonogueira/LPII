/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deyvisonnogueira.pkg2903.model;

/**
 *
 * @author 10870635662
 */
public class Viagem {
    private String identificadorViagem;
    private String Destino;
    private double valorKM;
    private double valorViagem;
    private double distanciaKM;    
    
    // construtor da classe
    
    public Viagem (String identificadorViagem,String Destino, double valorKM, double distanciaKM) {
        this.identificadorViagem = identificadorViagem;
        this.Destino = Destino;
        this.valorKM = valorKM;
        this.distanciaKM = distanciaKM;        
        
         
    }

    public Viagem(Cliente cliente, Motorista motorista, Onibus onibus, String destinoViagem, double valorKm, double km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdentificadorViagem() {
        return identificadorViagem;
    }

    public void setIdentificadorViagem(String identificadorViagem) {
        this.identificadorViagem = identificadorViagem;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }
    
    public void calcularViagem () {
        this.valorViagem = valorKM * distanciaKM;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public double getValorKM() {
        return valorKM;
    }

    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getDistancia() {
        return distanciaKM;
    }

    public void setDistancia(double distancia) {
        this.distanciaKM = distancia;
    }
    
}