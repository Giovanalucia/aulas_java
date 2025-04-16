package aula_03;

import java.util.Scanner;

public class AtividadeSwitch {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		float resultado = 0;
		
		System.out.println("***************************");
		System.out.println("   ` ` Calculadora ´  ´   ");
		System.out.println("1 - Soma (+)");
		System.out.println("2 - Subtração (-)");
		System.out.println("3 - Multiplicação (*)");
		System.out.println("4 - Divisão (/)");
		System.out.println("***************************");
		System.out.println("Digite 1º número: ");
		float num1 = leia.nextFloat();
		
		System.out.println("Digite 2º número: ");
		float num2 = leia.nextFloat();
		
		System.out.println("Escolha qual será a operação (1-4) ");
		int operador = leia.nextInt();
		
		switch(operador) {
		case 1: 
			resultado = num1 + num2;
			System.out.printf("\nO resultado é de: %.1f + %.1f = %.1f", num1, num2, resultado );
			break;
			
		case 2:
			resultado = num1 - num2;
			System.out.printf("\nO resultado é de: %.1f - %.1f = %.1f", num1, num2, resultado );
			break;
			
		case 3: 
			resultado = num1 * num2;
			System.out.printf("\nO resultado é de: %.1f * %.1f = %.1f", num1, num2, resultado );
			break;
			
		case 4:
			if (num2 !=0) {
				resultado = num1 / num2;
				System.out.printf("\nO resultado é de: %.1f / %.1f = %.1f", num1, num2, resultado );
			}else {
				System.out.println("Operação Inválida por 0!");
			}
			break;
			
		default:
			System.out.println("Opção Inválida!");
			leia.close();
			return;
		}
		 
		
		leia.close();
		}
	}
