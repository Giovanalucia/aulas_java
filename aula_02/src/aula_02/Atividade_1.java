package aula_02;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//Solicitando e lendo o salário e o abono
		System.out.println("Digite seu salário: " );
		float salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		float abono = leia.nextFloat();
		
		//Calculando novo salário
		System.out.printf("\nSeu novo salário é o total de: %.2f + %.2f = %.2f", salario, abono, (salario + abono));
		

	}

}
