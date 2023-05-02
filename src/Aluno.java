
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Aluno {
    
    private int codigo;
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Disciplina> diciplina;
    
    public class matricularDiciplina(Disciplina disciplina){
    
            
    }

    public Aluno(int codigo, String nome, String matricula, Curso curso, List<Disciplina> diciplina, List<Disciplina> disciplina) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.diciplina = diciplina;
        this.disciplina = disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(List<Disciplina> diciplina) {
        this.diciplina = diciplina;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", diciplina=" + diciplina + ", disciplina=" + disciplina + '}';
    }
    
}
