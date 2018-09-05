/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.exemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class AlunoDao {

    private ArrayList<Aluno> tabelaAlunos = new ArrayList<Aluno>();
    private static AlunoDao alunoDao;

    public static AlunoDao getInstance() {
        if (alunoDao == null) {
            alunoDao = new AlunoDao();
        }
        return alunoDao;
    }

    public Aluno salvarAluno(Aluno aluno) {
        int posicao = tabelaAlunos.size();
        aluno.setIdAluno(posicao);
        tabelaAlunos.add(posicao, aluno);
        return tabelaAlunos.get(posicao);
    }

    public ArrayList<Aluno> listarAlunos() {
        return tabelaAlunos;
    }

}
