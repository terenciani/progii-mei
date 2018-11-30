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
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class UsuarioDaoJDBC implements UsuarioDao{

    @Override
    public Usuario buscarUsuarioPorLogin(String login) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Usuario usuario = new Usuario();
        String sql = "SELECT * FROM tb_usuario WHERE usuario=?";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao.setString(1, login);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                usuario = transformaResultSetEmObjeto(resultado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return usuario;
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
        String sql = "INSERT "
                + "INTO " 
                + "tb_usuario( nome, usuario, senha)"
                + "VALUES (?, ?, ?)";
        try {

            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);

            
            preparacaoDaInstrucao.setString(1, usuario.getNome());
            preparacaoDaInstrucao.setString(2, usuario.getUsuario());
            preparacaoDaInstrucao.setString(3, usuario.getSenha());
           
            

            preparacaoDaInstrucao.executeUpdate();

            
            return usuario;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        

  
    }

    @Override
    public boolean excluirUsuario(Usuario usuario) {
         String sql = "DELETE FROM tb_usuario"
                    + "WHERE id=?";
         try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setInt(1, usuario.getId());

            preparacaoDaInstrucao.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }//To change body of generated methods, choose Tools | Templates.

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 private Usuario transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        Usuario usuario = new Usuario();
        try {
            usuario.setId(resultado.getInt("id"));
            usuario.setNome(resultado.getString("nome"));
            usuario.setUsuario(resultado.getString("usuario"));
            usuario.setSenha(resultado.getString("senha"));
            return usuario;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
}

