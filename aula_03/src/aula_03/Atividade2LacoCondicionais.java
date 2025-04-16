package aula_03;

import java.util.Scanner;

public class Atividade2LacoCondicionais {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = leia.nextInt();
        
        // Verificando se o número é positivo ou negativo
        if (num > 0) {
            System.out.print("Esse número é positivo");
        } 
        else if (num < 0) {
            System.out.print("Esse número é negativo");
        } 
        else {
            System.out.print("Esse número é zero");
        }
        
        // Verificando se o número é par, ímpar ou neutro 
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println(" e par!");
            } 
            else {
                System.out.println(" e ímpar!");
            }
        } 
        else {
            System.out.println(" (neutro)");
        }
        
        leia.close();
    }
}