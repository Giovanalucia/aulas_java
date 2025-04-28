package aula_05;

import java.util.Scanner;

public class Atividade_Vetor {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeros = leia.nextInt();
        
        // variável para usar depois
        int indice; 
        
        // encontrou e sai do laço
        for (indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numeros) {
                System.out.println("\nO número " + numeros + " está localizado na posição: " + indice);
                break;
            }
        }
        
        //se não encontrar
        if (indice == vetor.length) { 
            System.out.println("\nO número " + numeros + " não foi encontrado :( ");
        }

        leia.close();
    }
}
