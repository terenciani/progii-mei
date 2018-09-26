/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.UsuarioDao;
import br.estacio.mei.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author sena the great
 */
public class UsuarioDaoEstatica implements UsuarioDao{
    
    ArrayList<Usuario> tabelaUsuario = new ArrayList();
    
    @Override
    public Usuario buscarUsuarioPorLogin(Usuario usuario){
        return usuario;
    }
    
    @Override
    public Usuario salvarUsuario(Usuario usuario){
        tabelaUsuario.add(usuario);
        return usuario;
    }
    
    @Override
    public Usuario atualizarUsuario(Usuario usuario){
        for(int i = 0; i < tabelaUsuario.size(); i++){
            if(usuario.getId() == usuario.getId()){
                
            }
        }
        /*for (lista)
            achar a posicao
                    trocar pelo novo usuario*/
                            
        return usuario;
    }
    
    @Override
    public boolean excluirUsuario(Usuario usuario){
        return true;
    }


    @Override
    public ArrayList<Usuario> buscarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
