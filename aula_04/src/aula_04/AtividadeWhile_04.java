package aula_04;

import java.util.Scanner;

public class AtividadeWhile_04 {

    public static void main(String[] args) {
    	
    	//3) Atividade La�os de Repeti��o WHILE
        
        Scanner leia = new Scanner(System.in);
        
        int pessoasMenor21 = 0;
        int pessoasMaior50 = 0;
        
        System.out.print("Digite uma idade: ");
        int idade = leia.nextInt();
        
        //Verifica a condi��o e se for verdadeiro volta para bloco 1
        while (idade >= 0) {
            // Atualiza contadores
            if (idade < 21) {
                pessoasMenor21++;
            } else if (idade > 50) {
                pessoasMaior50++;
            }
            
            // Pede pr�xima idade 
            System.out.print("Digite outra idade (ou um n�mero negativo para sair): ");
            idade = leia.nextInt();
        }
        
        // Exibindo resultados
        System.out.println("\n    ``   RESULTADOS   ��   ");
        System.out.println("Total de menores de 21 anos: " + pessoasMenor21);
        System.out.println("Total de maiores de 50 anos: " + pessoasMaior50);
        
        leia.close();
    }
}