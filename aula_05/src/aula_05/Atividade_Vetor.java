package aula_05;

import java.util.Scanner;

public class Atividade_Vetor {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        
        System.out.print("Digite o n�mero que voc� deseja encontrar: ");
        int numeros = leia.nextInt();
        
        // vari�vel para usar depois
        int indice; 
        
        // encontrou e sai do la�o
        for (indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numeros) {
                System.out.println("\nO n�mero " + numeros + " est� localizado na posi��o: " + indice);
                break;
            }
        }
        
        //se n�o encontrar
        if (indice == vetor.length) { 
            System.out.println("\nO n�mero " + numeros + " n�o foi encontrado :( ");
        }

        leia.close();
    }
}
