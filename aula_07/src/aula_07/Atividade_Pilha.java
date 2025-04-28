package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_Pilha {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Stack<String> pilhaLivros = new Stack<>();
        
        int opcao = -1;

        
        while (opcao != 0) {
            System.out.println("*********************************");
            System.out.println("*   1: Adicionar um novo livro  *");
            System.out.println("*   2: Listar todos os livros   *");
            System.out.println("*   3: Retirar um livro         *");
            System.out.println("*   0: Sair                     *");
            System.out.println("*********************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();  
            
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nLivro adicionado!");
                    System.out.println("\nPilha:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    break;
                
                case 2:
                    System.out.println("\nLista de Livros na Pilha:");
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        pilhaLivros.pop();
                        System.out.println("\nUm Livro foi retirado da pilha!");
                        System.out.println("\nPilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }

        leia.close();
    }
}
