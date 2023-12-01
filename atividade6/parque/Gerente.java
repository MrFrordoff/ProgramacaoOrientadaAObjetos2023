package atividade6.parque;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario {
  private Integer qtdGerenciados;

  public Gerente(){
  }

  public Gerente(String nome, Integer cpf, Integer qtdGerenciados, Integer telefone) {
    super(nome, cpf,telefone);
    this.qtdGerenciados = qtdGerenciados;
  }
 //Get para ter a quantidade de funcionários gerenciados
  public Integer getQtdGerenciados() {
    return this.qtdGerenciados;
  }
//Set para definir a quantidade de funcionários gerenciados
  public void setQtdGerenciados(Integer qtdGerenciados) {
    this.qtdGerenciados = qtdGerenciados;
  }
//Override para que a classe gerente retorne um salário diferente do que a classe funcionário(classe pai)
  @Override
  public BigDecimal getSalario(){
      return new BigDecimal(20000.00);
  }
  
  public BigDecimal getBonificacao(){
      return getSalario().multiply(new BigDecimal(0.35));
  }

  @Override
  public String toString(){
      return "Gerente\n" +
          "Nome: " + getNome() + 
          ", Cpf: " + getCpf() + 
          ", Telefone:" + getTelefone() + 
          ", QuantidadeGerenciados: " + getQtdGerenciados() + 
          ", Salario: " + getSalario() +
          ", Bonificacao: " + getBonificacao().setScale(2, RoundingMode.HALF_UP)  +"\n";
  }
}
