/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public interface AlunoDao {

    public ArrayList<Aluno> buscarAlunos();

    public Aluno salvarAluno(Aluno aluno);

    public Aluno atualizarAluno(Aluno aluno);

    public boolean excluirAluno(Aluno aluno);
}
