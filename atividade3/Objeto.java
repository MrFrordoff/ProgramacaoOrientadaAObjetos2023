package atividade3;

public class Objeto {
    private int codigo;
    private String nome;
    private int quantidade;

    public Objeto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }
}
