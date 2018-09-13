/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.estacio.mei.model;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir Orico)
 */
public class Categoria {
    private int Codigo;
    private String descricao;
    
    public Categoria (int codigo) {
        this.Codigo(codigo);
    }
    
    public Categoria (int Codigo, String descricao) {
        this.Codigo = Codigo;
        this.descricao = descricao;
    }
    
    

    private void Codigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
