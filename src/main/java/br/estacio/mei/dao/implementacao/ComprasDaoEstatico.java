/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import br.estacio.mei.model.Compras;
import br.estacio.mei.dao.ComprasDao;
import java.util.ArrayList;

/**
 * Da
 *
 * @author rhena
 */
public class ComprasDaoEstatico implements ComprasDao {

    @Override
    public ArrayList<Compras> buscarCompras() {
        
        return BancoSingleton.getInstance().tabelaCompra;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compras salvarCompras(Compras compras) {
        BancoSingleton.getInstance().tabelaCompra.add(compras);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compras editarCompras(Compras compras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCompras(Compras compras) {
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
