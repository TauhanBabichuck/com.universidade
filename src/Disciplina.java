/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geang
 */
public class Disciplina {
  private int codigo;
  private String nome;
  private int numerodeVagas;

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome, int numerodeVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numerodeVagas = numerodeVagas;
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

    public int getNumerodeVagas() {
        return numerodeVagas;
    }

    public void setNumerodeVagas(int numerodeVagas) {
        this.numerodeVagas = numerodeVagas;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", nome=" + nome + ", numerodeVagas=" + numerodeVagas + '}';
    }
}
