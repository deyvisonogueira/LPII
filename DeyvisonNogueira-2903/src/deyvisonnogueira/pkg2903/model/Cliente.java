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
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    private Motorista m1;
    private Onibus onibus1;
    private ArrayList<Viagem> viagem1;

    public Cliente(String nome, Motorista m1, Onibus onibus1, ArrayList<Viagem> viagens) {
        this.nome = nome;
        this.m1 = m1;
        this.onibus1 = onibus1;
        this.viagem1 = viagens;
    }

   

    public void visualizarViagens() {
        System.out.println("Cliente: " + nome);
        System.out.println("Motorista: " + m1.getNome());
        System.out.println("Onibus: " + onibus1.getModeloOnibus());
        System.out.println("Viagens: ");
        for (Viagem viagem : viagem1) {
            System.out.println("Número identificador da viagem: " + viagem.getIdentificadorViagem());
            System.out.println("Destino: " + viagem.getDestino());
            System.out.println("Valor do quilômetro: " + viagem.getValorKM() + " Distância: " + viagem.getDistancia());
            System.out.println("Valor total da viagem: " + viagem.getValorKM()* viagem.getDistancia());
            System.out.println("Valor total de todas as viagens: " + viagem.getValorKM() + viagem.getValorKM());
            
        }
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Motorista getC1() {
        return m1;
    }

    public void setC1(Motorista m1) {
        this.m1 = m1;
    }

    public ArrayList<Viagem> getViagens() {
    return viagem1;
    }

    public void setViagens(ArrayList<Viagem> viagem) {
    this.viagem1 = viagem;
    }

    public Onibus getCarreta1() {
        return onibus1;
    }

    public void setCarreta1(Onibus onibus1) {
        this.onibus1 = onibus1;
    }
    
}
