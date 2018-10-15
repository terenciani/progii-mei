/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.model.Categoria;
import br.estacio.mei.dao.CategoriaDao;
import br.estacio.mei.banco.estatico.BancoSingleton;
import java.util.ArrayList;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir
 * Orico)
 */
public class CategoriaDaoEstatica implements CategoriaDao {

    @Override
    public ArrayList<Categoria> buscarCategoria() {

        return BancoSingleton.getInstance().tabelaCategoria;
    }

    @Override
    public Categoria salvarCategoria(Categoria categoria) {
        categoria.setCodigo(BancoSingleton.getInstance().tabelaCategoria.size() + 1);
        BancoSingleton.getInstance().tabelaCategoria.add(categoria);
        return categoria;

    }

    @Override
    public Categoria atualizarCategoria(Categoria categoria) {
        ArrayList<Categoria> categorias = BancoSingleton.getInstance().tabelaCategoria;
        for(int i=0; i< categorias.size();i++){
            if(categorias.get(i).getCodigo()==categoria.getCodigo()){
                BancoSingleton.getInstance().tabelaCategoria.add(i, categoria);
                return categoria;
            }
        }
        return null;
    }

    @Override
    public Categoria buscarCategoriaPorId(int codigo) {
        ArrayList<Categoria> categorias = BancoSingleton.getInstance().tabelaCategoria;
        for(Categoria categoria : categorias){
            if(categoria.getCodigo()==codigo)
                return categoria;
        }
        return null;
    }

    @Override
    public boolean excluirCategoria(Categoria categoria) {
        ArrayList<Categoria> categorias = BancoSingleton.getInstance().tabelaCategoria;
        for(Categoria cat : categorias){
            if(cat.getCodigo()==categoria.getCodigo()){
                BancoSingleton.getInstance().tabelaCategoria.remove(cat);
                return true;
            }
        }
        return false;
    }

}
