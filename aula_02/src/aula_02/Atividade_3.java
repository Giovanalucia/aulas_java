package aula_02;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Solicitando e lendo informa��es
		System.out.println("Digite seu sal�rio bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Digite seus descontos: ");
		float descontos = leia.nextFloat();
		
		//Calculando total do sal�rio lidquido
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5 ) - descontos;
		
		//Exibindo total
		System.out.printf("\nSeu sal�rio l�quido � de: %.2f", salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido);





	}

}
