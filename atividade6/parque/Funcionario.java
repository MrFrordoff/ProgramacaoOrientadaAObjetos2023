package atividade6.parque;

import java.math.BigDecimal;

public class Funcionario{
  private String nome;
  private Integer cpf;
  private Integer telefone;

  public Funcionario(){
  }
  
  public Funcionario(String nome, Integer cpf, Integer telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
  
  public String getNome(){
      return this.nome;
    }

  public void setNome(String nome){
      this.nome = nome;
    }
  public Integer getCpf(){
      return this.cpf;
    }
  public void setCpf(Integer cpf){
      this.cpf = cpf;
    }
  public Integer getTelefone(){
      return this.telefone;
    }
  public void setTelefone(Integer telefone){
      this.telefone = telefone;
    }
  public  BigDecimal getSalario(){
      return new BigDecimal(1200.00);
  }
   @Override
    public String toString() {
        return "Funcionario\n" +
            "Nome:" + getNome() + 
            ", Cpf: " + getCpf() + 
            ", Telefone: " + getTelefone() + 
            ", Salario: " + getSalario() + 
            "\n";
    }
}
