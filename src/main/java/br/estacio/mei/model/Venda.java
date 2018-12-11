/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.model;

import java.util.Date;




/**
 *
 * @author Aluno
 */
public class Venda {
    private int codigo;
    private String data;
    private Cliente cliente;
    private Usuario usuario;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    private double valor;
    private double desconto;
    private String observacao;
    private Object formaPagamento;
    private int status;
    
    public Object getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Object formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", data=" + data + ", cliente=" + cliente + ", usuario=" + usuario + ", valor=" + valor + ", observacao=" + observacao + ", desconto=" + desconto + ", status=" + status + "}";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    
}
