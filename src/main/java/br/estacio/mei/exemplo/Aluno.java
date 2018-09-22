/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.exemplo;

/**
 *
 * @author Marcelo
 */
public class Aluno {

    private int idAluno;
    private String nome;
    private Long RA;
    private int equipe;
    private double nota;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRA() {
        return RA;
    }

    public void setRA(long RA) {
        this.RA = RA;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.RA ^ (this.RA >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.RA != other.RA) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", RA=" + RA + '}';
    }

}
