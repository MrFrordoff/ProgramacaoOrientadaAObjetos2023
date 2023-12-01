package atividade6;

import java.util.Scanner;

import atividade6.parque.Funcionario;
import atividade6.parque.Gerente;
import atividade6.parque.Passaporte;
import atividade6.parque.Visitante;

class Executavel {
     public static void main(String[] args) {
          int opcao=0;
          Scanner scanner = new Scanner(System.in);

          while(opcao!=4){
               System.out.println("1-Lista de funcionarios");   
               System.out.println("2-Ingresso e Passaporte");   
               System.out.println("3-Numero de Visitantes");   
               System.out.println("4-SAIR ");   
               opcao = scanner.nextInt();
               executaropcao(opcao,opcao, scanner);
          }
          System.out.println("Saindo");
          scanner.close();
     }
     public static void executaropcao (int executaropcao, int op, Scanner scanner){
          switch(op){
               case 1:
               Gerente ger1 = new Gerente("Thiago", 71020895, 5, 932320084);
               System.out.println(ger1);
               Funcionario fun1 = new Funcionario("Pedrin", 807020100, 968587580);
               System.out.println(fun1);
               Funcionario fun2 = new Funcionario("Davi", 450159529, 954541223);
               System.out.println(fun2);
               Funcionario fun3 = new Funcionario("Joao", 80778920, 982825962);
               System.out.println(fun3);
               Funcionario fun4 = new Funcionario("Mariana", 710203569, 978564232);
               System.out.println(fun4);
               Funcionario fun5 = new Funcionario("Jessica", 845778960, 95980122);
               System.out.println(fun5);
               break;
               case 2: 
               Passaporte passaporte = new Passaporte(150.0, 7);
               double precoPassaporte = passaporte.calcularPreco();
               int diasValidade = passaporte.getDiasValidade();
               System.out.println("Preço do passaporte: " + precoPassaporte);
               System.out.println("Dias de validade do passaporte: " + diasValidade);
               break;
               case 3:
               Visitante visit = new Visitante(780, 350, 430, 530, 250);
               System.out.println(visit);
               break;
          }
     }
}


      






      



      

