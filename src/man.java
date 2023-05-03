
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
        Disciplina MateriaisEProcessos = new Disciplina(1001, "Materiais e Processos", 10);
        Disciplina Semiotica = new Disciplina(1002, "Semiótica", 10);
        Disciplina Ergonomia = new Disciplina(1003, "Ergonomia", 10);
        Disciplina DesenhoTecnico = new Disciplina(1004, "Desenho Técnico", 10);
        Disciplina DesignDeSuperficie = new Disciplina(1005, "Design de Superfície", 10);
        Disciplina Tipografia = new Disciplina(1006, "Tipografia", 10);
        Disciplina IlustracaoVetorial = new Disciplina(1007, "Ilustração Vetorial", 10);
        Disciplina ProducaoGrafica = new Disciplina(1008, "Produção Gráfica", 10);
        Disciplina ProducaoDeEmbalagem = new Disciplina(1009, "Produção de Embalagem", 10);
        Disciplina HistoriaDoDesign = new Disciplina(1010, "História do Design", 10);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(MateriaisEProcessos);
        disciplinas.add(Semiotica);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(DesignDeSuperficie);
        disciplinas.add(Tipografia);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(ProducaoGrafica);
        disciplinas.add(ProducaoDeEmbalagem);
        disciplinas.add(HistoriaDoDesign);
        
        Curso curso = new Curso(1001, "Design", disciplinas);
        
        
        Aluno Henrique =  new Aluno(1001, "Henrique", "101", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Moacir =  new Aluno(1002, "Moacir", "102", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Vinicius =  new Aluno(1003, "Vinicius", "103", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Eduardo =  new Aluno(1004, "Eduardo", "104", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Luan =  new Aluno(1005, "Luan", "105", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Gean =  new Aluno(1006, "Gean", "106", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Tauhan =  new Aluno(1007, "Tauhan", "107", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Kaiane =  new Aluno(1008, "Kainae", "108", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Luiza =  new Aluno(1009, "Luiza", "109", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Estefhany =  new Aluno(1010, "Estefhany", "110", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        Aluno Eduarda =  new Aluno(1011, "Eduarda", "111", curso, disciplinas);
        disciplinas.add(Ergonomia);
        disciplinas.add(DesenhoTecnico);
        disciplinas.add(HistoriaDoDesign);
        disciplinas.add(IlustracaoVetorial);
        disciplinas.add(Semiotica);
        
        
    }

}
