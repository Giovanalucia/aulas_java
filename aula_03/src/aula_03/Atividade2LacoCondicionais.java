package aula_03;

import java.util.Scanner;

public class Atividade2LacoCondicionais {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um n�mero: ");
        int num = leia.nextInt();
        
        // Verificando se o n�mero � positivo ou negativo
        if (num > 0) {
            System.out.print("Esse n�mero � positivo");
        } 
        else if (num < 0) {
            System.out.print("Esse n�mero � negativo");
        } 
        else {
            System.out.print("Esse n�mero � zero");
        }
        
        // Verificando se o n�mero � par, �mpar ou neutro 
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println(" e par!");
            } 
            else {
                System.out.println(" e �mpar!");
            }
        } 
        else {
            System.out.println(" (neutro)");
        }
        
        leia.close();
    }
}