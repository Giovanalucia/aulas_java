package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Defini��o de vari�veis
		
		System.out.println("Digite primeiro n�mero inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		int numero_02 = leia.nextInt();
		
		char opcao = 'V';
		boolean menorIdade = false;
		
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
		
		
		
		//Defini��o da constante PI
		final double PI = 3.1415;
		
		// Atribui��o de valor
		//numero_02 = 75;
		
		
		//Exibi��o em tela
		System.out.printf("Variavel numero 1 � igual a: %d\n", numero_01);
		System.out.println("Variavel numero 2 � igual a:" + numero_02);
		System.out.printf("Constante PI � igual a: %.2f\n", PI);
		System.out.println("Variaveis com letra mai�scula: " + nome.toUpperCase());
	}

}
