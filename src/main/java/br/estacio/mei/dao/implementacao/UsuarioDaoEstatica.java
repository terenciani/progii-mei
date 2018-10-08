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
    public Usuario buscarUsuarioPorLogin(String login){
        if(login.equals("admin")){
            Usuario usuario = new Usuario();
            usuario.setUsuario("admin");
            usuario.setSenha("admin");
            return usuario;
        }
        return null;
    }
    
    @Override
    public Usuario salvarUsuario(Usuario usuario){
        tabelaUsuario.add(usuario);
        return usuario;
    }
    
    @Override
    public Usuario atualizarUsuario(Usuario usuario){
        for(int i = 0; i < tabelaUsuario.size(); i++){
            if(tabelaUsuario.get(i).getId() == usuario.getId()){
                tabelaUsuario.add(i, usuario);
            }
        }
        /*for (lista)
            achar a posicao
                    trocar pelo novo usuario*/
                            
        return usuario;
    }
    
    @Override
    public boolean excluirUsuario(Usuario usuario){
        tabelaUsuario.remove(usuario);
        return true;
    }


    @Override
    public ArrayList<Usuario> buscarUsuarios() {
        return tabelaUsuario;
    }
}
