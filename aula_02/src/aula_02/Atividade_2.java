package aula_02;

import java.util.Scanner;

public class Atividade_2 {
	
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        // Solicitando e lendo as notas
        System.out.print("Digite o primeiro número: ");
        float nota1 = leia.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        float nota2 = leia.nextFloat();
        
        System.out.print("Digite o terceiro número: ");
        float nota3 = leia.nextFloat();
        
        System.out.print("Digite o quarto número: ");
        float nota4 = leia.nextFloat();
        
        // Calculando a média
        float media = (nota1 + nota2 + nota3 + nota4) / 4f;
        
        // Exibindo o resultado final
        System.out.printf("\nA média é de: %.2f, %.2f, %.2f e %.2f é: %.2f", nota1, nota2, nota3, nota4, media);
        
        System.out.println("\nIsso mesmo! Muito bem!");
    }
}