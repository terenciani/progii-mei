/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.exemplo;

import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class BancoDeDados {

    public ArrayList<Aluno> tabelaAlunos = new ArrayList<Aluno>();
    private static BancoDeDados banco;

    public static BancoDeDados getInstance() {
        if (banco == null) {
            banco = new BancoDeDados();
        }
        return banco;
    }
}
