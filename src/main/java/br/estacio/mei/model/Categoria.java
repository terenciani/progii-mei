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

    public Categoria() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void Codigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Categoria{" + "Codigo=" + Codigo + ", descricao=" + descricao + '}';
    }

}
