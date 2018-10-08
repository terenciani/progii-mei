/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import br.estacio.mei.model.Aluno;
import br.estacio.mei.dao.AlunoDao;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class AlunoDaoEstatico implements AlunoDao {

    @Override
    public ArrayList<Aluno> buscarAlunos() {
        return BancoSingleton.getInstance().tabelaAluno;
    }

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        BancoSingleton.getInstance().tabelaAluno.add(aluno);
        return aluno;
    }

    @Override
    public Aluno atualizarAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
