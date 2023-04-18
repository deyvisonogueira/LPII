/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deyvisonnogueira.pkg2903.model.view;

/**
 *
 * @author 10870635662
 */
import deyvisonnogueira.pkg2903.model.*;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Motorista motorista = new Motorista("Deyvison Nogueira");
        Onibus onibus = new Onibus("ct-6250");
        Viagem viagem = new Viagem("MG_RJ_2023","Belo Horizonte", 2.5, 450.0);
        
        
        viagem.calcularViagem();
        ArrayList<Viagem> viagens = new ArrayList<Viagem>();
        viagens.add(new Viagem("RJ_BH_2023", "Belo Horizonte", 4.5, 300.0));
        viagens.add(new Viagem("MG_RJ_2023", "Rio de Janeiro", 10.0, 800.0));
        
        Cliente cliente = new Cliente("Joaquim", motorista, onibus, viagens);
        
        cliente.setViagens(viagens);
        viagem.calcularViagem();
        cliente.visualizarViagens();
    }
}
