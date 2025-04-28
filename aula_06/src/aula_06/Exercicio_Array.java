package aula_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercicio_Array {
	
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        
        ArrayList<String> cores = new ArrayList<String>();

        // Solicitando ao usuário que insira as 5 cores
        System.out.println("Digite 5 cores:");

        // Usar um laço de repetição para receber as 5 cores
        for (int indice = 0; indice < 5; indice++) {
            System.out.print("Cor " + (indice + 1) + ": ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        // Exibindo todas as cores adicionadas
        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordenar as cores em ordem crescente
        cores.sort(null);

        // Exibir as cores em ordem crescente
        System.out.println("\nOrdenar as cores em ordem crescente:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
}
