/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.estacio.mei.dao;

import br.estacio.mei.model.Categoria;
import java.util.ArrayList;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir Orrico)
 */
public interface CategoriaDao {
    
    public ArrayList<Categoria> buscarCategoria();
    
    public Categoria salvarCategoria(Categoria categoria);

    public boolean atualizarCategoria(Categoria categoria);
    
    public Categoria buscarCategoriaPorId(int codigo);

    public boolean excluirCategoria(Categoria categoria);
    
    public boolean excluirCategoria(int codigo);
    
    public Categoria buscarCategoria(int codigo);
    

}
