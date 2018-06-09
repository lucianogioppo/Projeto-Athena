package me.gioppo.projetoathena.modelo;

public class AlunoDeTurma {

    private int numeroDoAluno;
    private Aluno aluno;

    public AlunoDeTurma(int numeroDoAluno, Aluno aluno) {
        this.numeroDoAluno = numeroDoAluno;
        this.aluno = aluno;
    }

    public int getNumeroDoAluno() {
        return numeroDoAluno;
    }

    public Aluno getAluno() {
        return aluno;
    }
    
}
