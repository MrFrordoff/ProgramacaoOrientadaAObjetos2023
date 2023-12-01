package atividade3;

import java.util.Scanner;

public class Sistema{
    public static void main(String[] args){
        int opcao=0;
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

    while (opcao!=5){
    System.out.println("1-Adicionar Objeto");
    System.out.println("2-Remover Objeto");
    System.out.println("3-Listar Objetos");
    System.out.println("4-Atualizar Quantidade do Objeto");
    System.out.println("5-Sair");
    System.out.print("Escolha uma opcao: ");
    opcao = scanner.nextInt();
    scanner.nextLine(); 

    switch(opcao){
        case 1:
        System.out.print("Digite o codigo do objeto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Digite o nome do objeto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        estoque.adicionarObjeto(new Objeto(codigo, nome, quantidade));
        break;

        case 2:
        System.out.print("Digite o codigo do objeto que sera removido: ");
        codigo = scanner.nextInt();
        estoque.removerObjeto(codigo);
        break;

        case 3:
        System.out.println("Objetos no estoque:");
        estoque.listarObjetos();
        break;

        case 4:
        System.out.print("Digite o código do objeto que sera atualizado: ");
        codigo = scanner.nextInt();
        System.out.print("Digite a nova quantidade: ");
        quantidade = scanner.nextInt();
        estoque.atualizarObjeto(codigo, quantidade);
        break;

        case 5:
        System.out.println("Fechando o sistema...");
        break;
        
        default:
        System.out.println("Opção invalida.");
        }
    }
    scanner.close();
}
}
