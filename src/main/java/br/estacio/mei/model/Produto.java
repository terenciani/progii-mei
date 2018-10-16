/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.model;

/**
 *
 * @author Marcelo
 */
public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private Fornecedor fornecedor;
    private double precoCompra;
    private double precoVenda;
    private float valorAtual;
    private float valorAntigo;
    private double lucro;
    private Categoria categoria;
    private String descricao;

    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, Fornecedor fornecedor, double precoCompra, double precoVenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(float valorAtual) {
        this.valorAtual = valorAtual;
    }

    public float getValorAntigo() {
        return valorAntigo;
    }

    public void setValorAntigo(float valorAntigo) {
        this.valorAntigo = valorAntigo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
