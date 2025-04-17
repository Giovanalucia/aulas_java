package aula_04;

import java.util.Scanner;

public class AtividadeFor_aula04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroPar = 0;
		int numeroIm = 0;
		
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("\nDigite o " + numero + "º número");
			int valor = leia.nextInt();
		if(valor % 2 == 0) {
			numeroPar++;
			
		}
		else {
			numeroIm++;
			
			
		}	
		} 
		
		System.out.println("\nEsse é o total de numeros pares!: " + numeroPar);
		System.out.println("\nEsse é o total de números ímpares!: " + numeroIm);
		
		leia.close();

	}

}
