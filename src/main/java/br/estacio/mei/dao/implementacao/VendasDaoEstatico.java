/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.GerenciarVendasDao;
import java.util.ArrayList;
/**
 *
 * @author venda
 */
public class VendasDaoEstatico implements GerenciarVendasDao{
    ArrayList<venda> bancoDeDados = new ArrayList();
    
    @Override
    public ArrayList<venda> buscarvendas() {
        return bancoDeDados;
    }

    @Override
    public venda salvarvenda(venda venda) {
        bancoDeDados.add(venda);
        return venda;
    }

    @Override
    public venda atualizarvenda(venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirvenda(venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
