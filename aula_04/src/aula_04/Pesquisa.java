package aula_04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
		
		int idade, esporte, futebol = 0, voleibolM18 = 0, basqueteMn18 = 0, totalRespostas = 0, somaIdades = 0;
		String continua = "S";
		
		while (continua.equalsIgnoreCase("S")) {
			
		
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			
			
			do {
			System.out.println("\nInforme o seu esporte favorito(1- Futebol / 2- V�lei / 3- Basquete / 4- Outros): ");
			esporte = leia.nextInt();
			
				if(esporte < 1 || esporte > 4) {
				System.out.println("Digite um valor entre 1 e 4");
				}
			
			}while(esporte < 1 || esporte > 4);
			
			// Quantas pessoas gostam de futebom? //
			if(esporte == 1) {
				futebol ++;
			}
			
			// Quantas pessoas gostam de voleibol e s�o maiores de 18 anos //
			if (esporte == 2 && idade > 18) {
				voleibolM18 ++;
	
			}
			
			// Quantas pessoas gostam de basquetebol e s�o menores de 18 anos //
			if (esporte == 3 && idade < 18) {
				basqueteMn18 ++;
				
			}
			
			totalRespostas ++;
			
			somaIdades += idade;
			
			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
			
			
		}
		
		double media = Math.round(somaIdades / totalRespostas);
		
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de voleibol e s�o maiores de idade: %d", voleibolM18);
		System.out.printf("\nTotal de pessoas que gostam de basquete e s�o menores de idade: %d", basqueteMn18);
		System.out.printf("\nM�dia de idade: " + media); 
		
		leia.close();
		
	}
	
}