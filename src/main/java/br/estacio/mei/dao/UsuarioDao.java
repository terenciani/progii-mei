/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;


import br.estacio.mei.model.Usuario;

/**
 *
 * @author sena the great
 */
public interface UsuarioDao {
    public Usuario buscarUsuarioPorLogin(Usuario usuario);
    
    public Usuario salvarUsuario(Usuario usuario);
    
    public Usuario atualizarUsuario (Usuario usuario);
    
    public boolean excluirUsuario(Usuario usuario);
}
