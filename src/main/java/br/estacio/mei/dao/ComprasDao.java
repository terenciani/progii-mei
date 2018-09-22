/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.Compras;
import java.util.ArrayList;

/**
 *
 * @author rhena
 */
public interface ComprasDao {

    public ArrayList<Compras> buscarCompras();

    public Compras salvarCompras(Compras compras);

    public Compras editarCompras(Compras compras);

    public boolean excluirCompras(Compras compras);
    
}
