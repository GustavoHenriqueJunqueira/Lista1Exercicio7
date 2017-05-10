package lista1exercicio7;

import java.util.Scanner;

public class Lista1Exercicio7 {

    public static void main(String[] args) {
       
        System.out.println("Programa para calcular o volume de uma esfera");
        
        float VOL, R;
        
        System.out.println("Digite o raio da esfera;");
        Scanner teclado = new Scanner (System.in);
        R = teclado.nextFloat();
        
        VOL = (float) (3.14 *(R*2));
        
        System.out.println("O volume da esfera é: " +VOL);
        
    }
    
}
