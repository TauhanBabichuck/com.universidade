
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    private List<Disciplina> DisciplinasMatriculadas;

    public Aluno() {
        DisciplinasMatriculadas = new ArrayList<>();

    }

    public void matricularDiciplina(Disciplina disciplina) {

        if ((DisciplinasMatriculadas.size() < 5) && (!DisciplinasMatriculadas.contains(disciplina))) {
            DisciplinasMatriculadas.add(disciplina);

        } else {
            System.out.println("disciplina nao pode ser add");

        }
    }

    public void ListarDiciplinas() {
        JOptionPane.showConfirmDialog(null, "Aluno matriculado em: \n" + DisciplinasMatriculadas);
        System.out.println("FALTAM"+(curso.getDisciplinas().size()-this.DisciplinasMatriculadas.size()));
    }

    public Aluno(int codigo, String nome, String matricula, Curso curso, List<Disciplina> matricularDiciplina) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.DisciplinasMatriculadas = matricularDiciplina;

    }

    public List<Disciplina> getMatricularDiciplina() {
        return DisciplinasMatriculadas;
    }

    public void setMatricularDiciplina(List<Disciplina> matricularDiciplina) {
        this.DisciplinasMatriculadas = matricularDiciplina;

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

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", matricularDiciplina=" + DisciplinasMatriculadas + '}';
    }

}
