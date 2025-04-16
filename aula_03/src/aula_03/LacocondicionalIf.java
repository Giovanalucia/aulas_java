package aula_03;

import java.util.Scanner;

public class LacocondicionalIf {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero: ");
        int numero1 = leia.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        int numero2 = leia.nextInt();
        System.out.println("Digite o terceiro n�mero: ");
        int numero3 = leia.nextInt();
        
        int soma = numero1 + numero2 + numero3;
        
        System.out.printf("\n%d + %d + %d = %d", numero1, numero2, numero3, soma);
        
        if (soma > numero3) {
            System.out.printf("\nA soma (%d) � maior que %d", soma, numero3);
        } 
        else if (soma < numero3) {
            System.out.printf("\nA soma (%d) � menor que %d", soma, numero3);
        } 
        else { 
            System.out.printf("\nA soma (%d) � igual %d", soma, numero3);
        }
        
        leia.close();
    }
}