package aula_05;

import java.util.Scanner;

public class Atividade_Matriz {

	public static void main(String[] args) {
		
		        Scanner leia = new Scanner(System.in);
		        
		        //Criando matriz 3 por 3
		        int[][] matriz = new int[3][3];
		        int somaPrincipal = 0;
		        int somaSecundaria = 0;

		        // Entrada de dados
		        System.out.println("Digite os elementos da matriz 3x3:");
		        for (int linha = 0; linha < 3; linha++) {
		            for (int coluna = 0; coluna < 3; coluna++) {
		                matriz[linha][coluna] = leia.nextInt();
		            }
		        }

		        // Mostrando a Diagonal Principal
		        System.out.println("\nElementos da Diagonal Principal:");
		        for (int indice = 0; indice < 3; indice++) {
		            System.out.print(matriz[indice][indice] + " ");
		            somaPrincipal += matriz[indice][indice];
		        }

		        // Mostrando a Diagonal Secundária
		        System.out.println("\nElementos da Diagonal Secundária:");
		        for (int indice = 0; indice < 3; indice++) {
		            System.out.print(matriz[indice][2 - indice] + " ");
		            somaSecundaria += matriz[indice][2 - indice];
		        }

		        // Mostrando as somas
		        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSecundaria);

		        leia.close();
		    }
		}