/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.estacio.mei.vision;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private float valorAtual;
    private float valorAntigo;
    private double lucro;
    private String descricao;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.codigo;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + this.quantidade;
        hash = 23 * hash + Float.floatToIntBits(this.valorAtual);
        hash = 23 * hash + Float.floatToIntBits(this.valorAntigo);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.lucro) ^ (Double.doubleToLongBits(this.lucro) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Float.floatToIntBits(this.valorAtual) != Float.floatToIntBits(other.valorAtual)) {
            return false;
        }
        if (Float.floatToIntBits(this.valorAntigo) != Float.floatToIntBits(other.valorAntigo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lucro) != Double.doubleToLongBits(other.lucro)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
}
