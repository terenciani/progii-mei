/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import br.estacio.mei.dao.ContasAPagarDao;
import br.estacio.mei.model.ContasAPagar;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class ContasAPagarDaoEstatica implements ContasAPagarDao {

    

    @Override
    public ArrayList<ContasAPagar> buscarContasApagar() {
        return BancoSingleton.getInstance().tabelaContaAPagar;
    }

    @Override
    public ContasAPagar salvarContasApagar(ContasAPagar contasAPagar) {
        BancoSingleton.getInstance().tabelaContaAPagar.add(contasAPagar);
        return contasAPagar;
    }

    @Override
    public ContasAPagar atualizarContasApagar(ContasAPagar contasAPagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirContasApagar(ContasAPagar contasAPagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
