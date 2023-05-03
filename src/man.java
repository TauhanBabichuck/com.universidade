
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

    public static void main(String[] args) {
        Disciplina Zoologia = new Disciplina(1001, "Zoologia", 10);
        Disciplina Matematica = new Disciplina(1002, "Matematica", 10);
        Disciplina Biologia = new Disciplina(1003, "Biologia", 10);
        Disciplina Morfologia = new Disciplina(1004, "Morfologia", 10);
        Disciplina Quimica = new Disciplina(1005, "Quimica", 10);
        Disciplina Microbiologia = new Disciplina(1006, "Microbiologia", 10);
        Disciplina Anatomia = new Disciplina(1007, "Anatomia", 10);
        Disciplina Genetica = new Disciplina(1008, "Genetica", 10);
        Disciplina Mecanica = new Disciplina(1009, "Mecanica", 10);
        Disciplina Economia = new Disciplina(1010, "Economia", 10);
    
  List<Disciplina> disciplinas = new ArrayList<>();
  disciplinas.add(Zoologia);
  disciplinas.add(Matematica);
  disciplinas.add(Biologia);
  disciplinas.add(Morfologia);
  disciplinas.add(Quimica);
  disciplinas.add(Microbiologia);
  disciplinas.add(Anatomia);
  disciplinas.add(Genetica);
  disciplinas.add(Mecanica);
  disciplinas.add(Economia);
     Curso curso = new Curso(1001, "Agronomia", disciplinas);
     
     Aluno Henrique = new Aluno(1001, "Henrique", "101", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Moacir = new Aluno(1002, "Moacir", "102", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Vinicius = new Aluno(1003, "Vinicius", "103", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Eduardo = new Aluno(1004, "Eduardo", "104", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Luan = new Aluno(1005, "Luan", "105", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Gean = new Aluno(1006, "Gean", "106", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Tauhan = new Aluno(1007, "Tauhan", "107", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Kaiane = new Aluno(1008, "Kaiane", "108", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Luiza = new Aluno(1009, "Luiza", "109", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Esthefany = new Aluno(1010, "Esthefany", "110", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
     Aluno Eduarda = new Aluno(1011, "Eduarda", "111", curso, disciplinas);
     disciplinas.add(Zoologia);
     disciplinas.add(Matematica);
     disciplinas.add(Biologia);
     disciplinas.add(Anatomia);
     disciplinas.add(Genetica);
     
}
}

