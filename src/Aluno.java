
import java.util.ArrayList;
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
    private List<Disciplina> matricularDiciplina;
    
    
    public Aluno(){
    matricularDiciplina = new ArrayList<>();
    
}
    
    public void matricularDiciplina(Disciplina disciplina){
        
        if((matricularDiciplina.size() < 5 )&&(!matricularDiciplina.contains(disciplina))){
        matricularDiciplina.add(disciplina);
        
    }else{
    System.out.println("disciplina nao pode ser add");


            }
}


    public Aluno(int codigo, String nome, String matricula, Curso curso, List<Disciplina> matricularDiciplina) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.matricularDiciplina = matricularDiciplina;

    }

    public List<Disciplina> getMatricularDiciplina() {
        return matricularDiciplina;
    }

    public void setMatricularDiciplina(List<Disciplina> matricularDiciplina) {
        this.matricularDiciplina = matricularDiciplina;

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
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", matricularDiciplina=" + matricularDiciplina + '}';
    }


}

    