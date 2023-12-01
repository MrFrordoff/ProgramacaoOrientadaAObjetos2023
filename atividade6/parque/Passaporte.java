package atividade6.parque;

public class Passaporte extends Ingresso {
  private int diasValidade;


  public Passaporte(double valor, int diasValidade) {
    super(valor);
    this.diasValidade = diasValidade;
  }

  public int getDiasValidade() {
    return diasValidade;
  }

  public void setDiasValidade(int diasValidade) {
    this.diasValidade = diasValidade;
  }
}
