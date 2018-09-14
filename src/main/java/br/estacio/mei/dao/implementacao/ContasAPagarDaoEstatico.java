/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import java.util.ArrayList;
import br.estacio.mei.dao.ContasAPagarDao;
import br.estacio.mei.model.ContasAPagar;
/**
 *
 * @author aluno
 */
public class ContasAPagarDaoEstatico implements ContasAPagarDao {
    
     ArrayList<ContasAPagar> bancoDeDados = new ArrayList();
    

    @Override
    public ArrayList<ContasAPagar> buscarContasApagarDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContasAPagar salvarContasApagarDao(ContasAPagarDao ContasApagarDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContasAPagar atualizarContasApagarDao(ContasAPagarDao ContasApagarDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirContasApagarDao(ContasAPagarDao ContasApagarDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
