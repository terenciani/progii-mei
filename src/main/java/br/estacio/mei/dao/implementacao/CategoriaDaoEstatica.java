/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.estacio.mei.dao.implementacao;

import br.estacio.mei.model.Categoria;
import br.estacio.mei.dao.CategoriaDao;
import br.estacio.mei.visao.categoria.BancoSingleton;
import java.util.ArrayList;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir Orico)
 */

public class CategoriaDaoEstatica implements CategoriaDao {
    ArrayList<Categoria> listaCategoria = new ArrayList();

    @Override
    public ArrayList<Categoria> buscarCategoria() {

        return BancoSingleton.getInstance().tabelaCategorias;
    }

    @Override
    public Categoria salvarCategoria(Categoria categoria) {
        BancoSingleton.getInstance().tabelaCategorias.add(categoria);
        return categoria;
        
    }

    @Override
    public Categoria atualizarCategoria(Categoria categoria) {
        BancoSingleton.getInstance().tabelaCategorias.get(0);
        return categoria;
        
    }

    @Override
    public Categoria listarCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCategoria(Categoria categoria) {
        return true;
        
    }
    

}