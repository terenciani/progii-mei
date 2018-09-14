/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.RelatorioEstoque;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public interface RelatorioEstoqueDao {

    public ArrayList<RelatorioEstoque> buscarRelatorio();

   
}
