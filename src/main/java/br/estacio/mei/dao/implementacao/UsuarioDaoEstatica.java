/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.UsuarioDao;
import br.estacio.mei.model.Usuario;

/**
 *
 * @author sena the great
 */
public class UsuarioDaoEstatica implements UsuarioDao{
    
    Usuario usuario = new Usuario();
    
    @Override
    public Usuario buscaUsuarioPorLogin(Usuario usuario){
        return usuario;
    }
    
    @Override
    public Usuario salvarUsuario(Usuario usuario){
        Usuario.add(usuario);
        return usuario;
    }
    
    @Override
    public Usuario atualizarUsuario(Usuario usuario){
        return usuario;
    }
    
    @Override
    public boolean excluirUsuario(Usuario usuario){
        return true;
    }
}
