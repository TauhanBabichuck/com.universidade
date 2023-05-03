
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
public class man {

    public void ListaDeDisciplinas() {
        Disciplina algoritmo = new Disciplina(1001, "Algoritmo", 10);
        Disciplina linguagens = new Disciplina(1002, "Linguagens", 10);
        Disciplina codigo = new Disciplina(1003, "Código", 10);
        Disciplina calculo = new Disciplina(1004, "Cálculo", 10);
        Disciplina estatistica = new Disciplina(1005, "Estatística", 10);
        Disciplina empreendedorismo = new Disciplina(1006, "Empreendedorismo", 10);
        Disciplina codigoFonte = new Disciplina(1007, "Codigo Fonte", 10);
        Disciplina probabilidade = new Disciplina(1008, "Probabilidade", 10);
        Disciplina organizaçãoDeComputadores = new Disciplina(1009, "Organização de computadores.", 10);
        Disciplina bancoDedados = new Disciplina(1010, " Banco de dados", 10);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(algoritmo);
        disciplinas.add(linguagens);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);
        disciplinas.add(bancoDedados);

        Curso curso = new Curso(1001, "Ciencia da computação", disciplinas);

        Aluno henrique = new Aluno(1001, "Henrique", "101", curso, disciplinas);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);

        Aluno kaiane = new Aluno(1002, "Kaiane", "102", curso, disciplinas);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);
        disciplinas.add(bancoDedados);

        Aluno tauhan = new Aluno(1003, "Tauhan", "103", curso, disciplinas);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);

        Aluno gean = new Aluno(1004, "Gean", "104", curso, disciplinas);
        disciplinas.add(linguagens);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);

        Aluno luiza = new Aluno(1005, "Luiza", "105", curso, disciplinas);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);
        disciplinas.add(bancoDedados);
        disciplinas.add(linguagens);

        Aluno eduardo = new Aluno(1006, "Eduardo", "106", curso, disciplinas);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);
        disciplinas.add(bancoDedados);

        Aluno eduarda = new Aluno(1007, "Eduarda", "107", curso, disciplinas);
        disciplinas.add(algoritmo);
        disciplinas.add(linguagens);
        disciplinas.add(codigo);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);

        Aluno estefhany = new Aluno(1008, "Estefhany ", "108", curso, disciplinas);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);

        Aluno moacir = new Aluno(1009, "Moacir", "109", curso, disciplinas);
        disciplinas.add(linguagens);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(estatistica);
        disciplinas.add(empreendedorismo);

        Aluno vini = new Aluno(1010, "Vini", "110", curso, disciplinas);
        disciplinas.add(linguagens);
        disciplinas.add(codigo);
        disciplinas.add(calculo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);

        Aluno luan = new Aluno(1011, "Luan", "111", curso, disciplinas);
        disciplinas.add(empreendedorismo);
        disciplinas.add(codigoFonte);
        disciplinas.add(probabilidade);
        disciplinas.add(organizaçãoDeComputadores);
        disciplinas.add(algoritmo);

    }

}
