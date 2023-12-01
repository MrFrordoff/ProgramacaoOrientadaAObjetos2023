package atividade1;

public class verificaNumeroPrimo{
    public static void main(String[] args){
        int numero = 17; 
        int resultado = verificadorNumeroPrimo(numero);
        
        if(resultado == 1){
            System.out.println(numero + "e primo.");
        }else{
            System.out.println(numero + "não e primo.");
        }
    }

    public static int verificadorNumeroPrimo(int n){
        if(n <= 1){
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return 0; 
            }
        }
        return 1; 
    }
}

