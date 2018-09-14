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
public class ContasAPagar {
       private int codigo;
       private int dataVencimento;
       private String descricao;
       private Double valor;
       private int dataPagamento;
       private String status;

    public int getCodigo() {
        return codigo;
    }

    public int getDataPagamento() {
        return dataPagamento;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public Double getValor() {
        return valor;
    }
       
        
}
