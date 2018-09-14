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
            
            
    public ArrayList<RelatorioEstoque> buscarAlunos() {
        return bancoDeDados;
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<RelatorioEstoque> buscarRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
