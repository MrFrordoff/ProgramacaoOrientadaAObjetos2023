package atividade6.parque;

public class Visitante {
  private Integer qtdVisitantes;
  private Integer qtdAdultos;
  private Integer qtdCriancas;
  private Integer ingressosVendidos;
  private Integer passaporteVendidos;

  public Visitante() {
  }

  public Visitante( Integer qtdVisitantes, Integer qtdAdultos, Integer qtdCriancas, Integer ingressosVendidos, Integer passaporteVendidos){
    this.qtdVisitantes = qtdVisitantes;
    this.qtdAdultos = qtdAdultos;
    this.qtdCriancas = qtdCriancas;
    this.ingressosVendidos = ingressosVendidos;
    this.passaporteVendidos = passaporteVendidos;
    
  }
  public Integer getqtdVisitantes(){
    return this.qtdVisitantes;
  }
  public void setqtdVisitantes(Integer qtdVisitantes){
    this.qtdVisitantes = qtdVisitantes;
  }

  public Integer getqtdAdultos(){
    return this.qtdAdultos;
  }

  public void setqtdAdultos(Integer qtdAdultos){
    this.qtdAdultos = qtdAdultos;
  }
  public Integer getqtdCriancas(){
    return this.qtdCriancas;
  }
  public void setqtdCriancas(Integer qtdCriancas){
    this.qtdCriancas = qtdCriancas;
  }

  public Integer getpassaporteVendidos(){
    return this.passaporteVendidos;
  }

public void setpassaporteVendidos(Integer passaporteVendidos){
    this.passaporteVendidos = passaporteVendidos;
  }

  public Integer getingressosVendidos(){
    return this.ingressosVendidos;
  }

public void setingressosVendidos(Integer ingressosVendidos){
    this.ingressosVendidos = ingressosVendidos;
  }
  
  @Override
    public String toString() {
        return "Visitante\n " +
            "Quantidade de visitantes: " + getqtdVisitantes() +
            ", Ingressos Vendidos: " + getingressosVendidos() +
            ", Passaportes vendidos: " + getpassaporteVendidos() +
            ", Quantidade de adultos: " + getqtdAdultos() +
            ", Quantidade de crianças: " + getqtdCriancas() +"";
    }

}
