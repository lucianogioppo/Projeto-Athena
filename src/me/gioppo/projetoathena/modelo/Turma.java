package me.gioppo.projetoathena.modelo;

import java.util.List;

public class Turma {
    
    private int ano;
    private String letra;
    private List<AlunoDeTurma> alunosNaTurma;

    public Turma(int ano, String letra, List<AlunoDeTurma> alunos) {
        this.ano = ano;
        this.letra = letra;
        this.alunosNaTurma = alunos;
    }

    public int getAno() {
        return ano;
    }

    public String getLetra() {
        return letra;
    }
    
    public List<AlunoDeTurma> getTodosOsAlunos() {
        return alunosNaTurma;
    }
    
    public AlunoDeTurma getAlunoPorNumero(int numero) {
        for(AlunoDeTurma aluno : alunosNaTurma){
            if(aluno.getNumeroDoAluno() == numero){
                return aluno;
            }
        }
        return null;
    }
    
}
