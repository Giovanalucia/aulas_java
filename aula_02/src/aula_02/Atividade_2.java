package aula_02;

import java.util.Scanner;

public class Atividade_2 {
	
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        // Solicitando e lendo as notas
        System.out.print("Digite o primeiro n�mero: ");
        float nota1 = leia.nextFloat();
        
        System.out.print("Digite o segundo n�mero: ");
        float nota2 = leia.nextFloat();
        
        System.out.print("Digite o terceiro n�mero: ");
        float nota3 = leia.nextFloat();
        
        System.out.print("Digite o quarto n�mero: ");
        float nota4 = leia.nextFloat();
        
        // Calculando a m�dia
        float media = (nota1 + nota2 + nota3 + nota4) / 4f;
        
        // Exibindo o resultado final
        System.out.printf("\nA m�dia � de: %.2f, %.2f, %.2f e %.2f �: %.2f", nota1, nota2, nota3, nota4, media);
        
        System.out.println("\nIsso mesmo! Muito bem!");
    }
}