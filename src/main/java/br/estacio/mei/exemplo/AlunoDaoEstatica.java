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
public class AlunoDaoEstatica implements AlunoDao {

    public Aluno salvarAluno(Aluno aluno) {
        int posicao = BancoDeDados.getInstance().tabelaAlunos.size();
        aluno.setIdAluno(posicao);
        BancoDeDados.getInstance().tabelaAlunos.add(posicao, aluno);
        return BancoDeDados.getInstance().tabelaAlunos.get(posicao);
    }

    public ArrayList<Aluno> listarAlunos() {
        return BancoDeDados.getInstance().tabelaAlunos;
    }

    @Override
    public Aluno buscarPorId(int id) {
        if(BancoDeDados.getInstance().tabelaAlunos.size() > 0 )
            return BancoDeDados.getInstance().tabelaAlunos.get(id);
        return null;
    }
    @Override
    public boolean excluirAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno atualizarAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
