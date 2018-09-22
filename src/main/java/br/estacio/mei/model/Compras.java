/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.model;

import java.util.Objects;

/**
 *
 * @author rhena
 */
public class Compras {
   private String descricao;
   private double valor;
   private int quantidade;
   private String dataCompra;
   private double totalCompra;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 37 * hash + this.quantidade;
        hash = 37 * hash + Objects.hashCode(this.dataCompra);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalCompra) ^ (Double.doubleToLongBits(this.totalCompra) >>> 32));
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
        final Compras other = (Compras) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalCompra) != Double.doubleToLongBits(other.totalCompra)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.dataCompra, other.dataCompra);
    }

    @Override
    public String toString() {
        return "Compras{" + "descricao=" + descricao + ", valor=" + valor + ", quantidade=" + quantidade + ", dataCompra=" + dataCompra + ", totalCompra=" + totalCompra + '}';
    }
    
}
