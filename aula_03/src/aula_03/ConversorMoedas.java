package aula_03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		
		System.out.println("*******************************");
		System.out.println("   Conversos de Moedas   ");
		System.out.println("*******************************");
		System.out.println("1 - Converter para D�lar (US$)");
		System.out.println("2 - Converter para Euros (EU$) ");
		System.out.println("3 - Converter para Peso (AR$)");
		System.out.println("                          ");
		System.out.println("*******************************");
		System.out.println("Digite a op��o desejada:    ");
		
		int opcao = leia.nextInt();
		
		System.out.println("Digite o valor em reais");
		double valor = leia.nextDouble();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "D�lar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			
			break;
		default:
			System.out.println("Op��o inv�lida");
			leia.close();
			return; //Sair do programa
		}
				
		System.out.printf("Valor convertido em %s: %.2f ", moeda, valorConvertido);		
		
		leia.close();

	}

}
