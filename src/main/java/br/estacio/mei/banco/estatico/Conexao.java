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
public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/progii_mei";
    private static final String usuario = "postgres";
    private static final String senha = "lucas";
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
