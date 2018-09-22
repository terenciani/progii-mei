 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.model.RelatorioEstoque;
import br.estacio.mei.dao.RelatorioEstoqueDao;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class RelatorioEstoqueDaoEstatico implements RelatorioEstoqueDao{
    ArrayList<RelatorioEstoque> bancoDeDados = new ArrayList();
            
            
    @Override
    public ArrayList<RelatorioEstoque> buscarRelatorio() {
        return bancoDeDados;
    }


    
    
}
