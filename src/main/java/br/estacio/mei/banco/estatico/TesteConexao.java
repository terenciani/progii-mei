/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.banco.estatico;

import br.estacio.mei.dao.AlunoDao;
import br.estacio.mei.dao.implementacao.AlunoDaoJDBC;
import br.estacio.mei.model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class TesteConexao {
    public static void main(String[] args) {
        /* Executar um de cada vez */

        //Aluno aluno = testeInsersao();
        //testeAtualizacao(aluno);
        //testeBuscarPorId(aluno.getId());
        //testeBuscarTodosAlunos();
        testeRemoverTodos();
    }
    private static Aluno testeInsersao(){
        AlunoDao alunoDao = new AlunoDaoJDBC();
        
        Aluno aluno = new Aluno();
        aluno.setNome("Teste");
        aluno.setRA(12345);
        aluno.setSenha("1234");
        
        aluno = alunoDao.salvarAluno(aluno);
        System.out.println(aluno);
        
        return aluno;
    }
    
    private static void testeAtualizacao(Aluno aluno){
        AlunoDao alunoDao = new AlunoDaoJDBC();
        aluno = alunoDao.atualizarAluno(aluno);
        System.out.println(aluno);
    }
    
    private static void testeBuscarPorId(int id){
        AlunoDao alunoDao = new AlunoDaoJDBC();
        
        Aluno aluno = alunoDao.buscarAlunoPorId(id);
        System.out.println(aluno.toString());
    }
    
    private static void testeBuscarTodosAlunos(){
        AlunoDao alunoDao = new AlunoDaoJDBC();
        
        ArrayList<Aluno> alunos = alunoDao.buscarAlunos();
        for(Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }
    }
    
    private static void testeRemoverTodos(){
        AlunoDao alunoDao = new AlunoDaoJDBC();
        
        ArrayList<Aluno> alunos = alunoDao.buscarAlunos();
        for(Aluno aluno : alunos){
            alunoDao.excluirAluno(aluno);
        }
    }
}
