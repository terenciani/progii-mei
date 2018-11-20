/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.UsuarioDao;
import br.estacio.mei.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class UsuarioDaoJDBC implements UsuarioDao{

    @Override
    public Usuario buscarUsuarioPorLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> buscarUsuarios() {
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
        String SQL = "SELECT * FROM tb_usuario";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                Usuario usu = new Usuario();
                usu.setId(resultado.getInt("id"));
                usu.setSenha(resultado.getString("senha"));
                usu.setUsuario(resultado.getString("usuario"));
                listaDeUsuarios.add(usu);
            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeUsuarios;        
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        String sql = "UPDATE tb_usuario set usuario = ?";
        Usuario usu = new Usuario();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        String sql = "DELETE usuario WHERE tb_usuario = 'usuario'";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

