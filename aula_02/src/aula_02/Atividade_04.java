package aula_02;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Solicitando e lendo os digitos escolhidos
		System.out.println("Digite o primeiro digito: ");
		float numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo d�gito: ");
		float numero2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro digito: ");
		float numero3 = leia.nextFloat();
		
		System.out.println("Digite o quarto digito: ");
		float numero4 = leia.nextFloat();
		
		//Calculando diferen�as dos produtos
		float calculo = (numero1 * numero2) - (numero3 * numero4);
		
		//Ebixindo calculo final
		System.out.printf("\nA diferen�a entre o primeiro e o segundo digito com o terceiro e o quarto digito � de: %.1f", calculo);


	}

}
