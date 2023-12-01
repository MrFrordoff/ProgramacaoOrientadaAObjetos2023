package atividade3;

import java.util.ArrayList;

public class Estoque{
    private ArrayList<Objeto> objetos;

    public Estoque(){
        this.objetos = new ArrayList<>();
    }
    public void adicionarObjeto(Objeto objeto){
        this.objetos.add(objeto);
    }
    public void removerObjeto(int codigo){
        this.objetos.removeIf(obj -> obj.getCodigo() == codigo);
    }
    public void atualizarObjeto(int codigo, int novaQuantidade){
        for (Objeto obj : objetos){
            if (obj.getCodigo() == codigo){
                obj.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
    public void listarObjetos(){
        for (Objeto obj : objetos){
            System.out.println("Código: " + obj.getCodigo() + ", Nome: " + obj.getNome() + ", Quantidade: " + obj.getQuantidade());
        }
    }
}
