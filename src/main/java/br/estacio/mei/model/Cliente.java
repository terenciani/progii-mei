/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.model;

/**
 *
 * @author aluno
 */
public class Cliente {

    private int codigo;
    private String cpfCnpj;
    private String nome;
    private String nomeFantasia;
    private String inscrEstadual;
    private int telefone;
    private String email;
    private Endereco endereco;

    public Cliente() {
    }
    
    public Cliente(int codigo, String cpfCnpj, String nome, String nomeFantasia, String inscrEstadual, int telefone, String email, Endereco endereco) {
        this.codigo = codigo;
        this.cpfCnpj = cpfCnpj;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.inscrEstadual = inscrEstadual;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscrEstadual() {
        return inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "codigo= " + codigo + ", cpfCnpj= " + cpfCnpj + ", nome= " + nome + ", nomeFantasia= " + nomeFantasia + ", inscrEstadual= " + inscrEstadual + ", telefone= " + telefone + ", email= " + email + '}';
    }
     

}
