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
public interface AlunoDao {

    public Aluno salvarAluno(Aluno aluno);

    public boolean excluirAluno(Aluno aluno);

    public ArrayList<Aluno> listarAlunos();

    public Aluno atualizarAluno(Aluno aluno);
    
    public Aluno buscarPorId(int id);

}
