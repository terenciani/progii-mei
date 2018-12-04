/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.banco.estatico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ConexaoMySQL {
    
    /*
    private static final String URL = "jdbc:mysql://terenciani.com.br/teren671_progii_mei";
    private static final String usuario = "teren671_estacio";
    private static final String senha = "estacio@123";
    private static Connection conexao = null;
    */
    
    private static final String URL = "jdbc:mysql://ericvdias.com/ericvd20_progii_mei";
    private static final String usuario = "ericvd20_estacio";
    private static final String senha = "estacio@123";
    private static Connection conexao = null;
    

    public static Connection retornaConexao() {
        if (conexao == null) {

            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conexao;
    }
}
