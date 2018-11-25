/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.banco.estatico;

import br.estacio.mei.dao.implementacao.AlunoDaoMySQL;
import br.estacio.mei.model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class TesteConexaoMySQL {
    public static void main(String[] args) {
        /* Executar um de cada vez */

        
        testeBuscarTodosAlunos();
        
    }
    
    private static void testeBuscarTodosAlunos(){
        AlunoDaoMySQL alunoDao = new AlunoDaoMySQL();
        
        ArrayList<Aluno> alunos = alunoDao.buscarAlunos();
        for(Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }
    }
}
