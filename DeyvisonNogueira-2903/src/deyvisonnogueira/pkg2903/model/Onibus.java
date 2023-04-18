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
public class Onibus {
    private String modeloOnibus;
    
    // construtor da classe
    public Onibus(String modeloOnibus) {
        this.modeloOnibus = modeloOnibus;
    }

    public Onibus(String branco, String ct7000) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModeloOnibus() {
        return modeloOnibus;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloOnibus = modeloOnibus;
    }
    
}
