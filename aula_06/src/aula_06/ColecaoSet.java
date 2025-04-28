package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Ma��");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Ma��");
		frutas.add("ma��");
		frutas.add("abacate");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("Morando existe na cole��o? " + frutas.contains("Morango"));
		
		// Excluir um elemento da cole��o
		frutas.remove("Morango");
		
		// Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// Listar os dados ap�s a exclus�o de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		// Criamos a Cole��o ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		// Adicionamos todos os elementos da Cole��o Set (frutas) 
		// na Cole��o ArrayList (futasList)
		frutasList.addAll(frutas);
		
		// Ordenamos futasList em ordem crescente
		frutasList.sort(null);
		
		// Exibimos frutaList em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);
	}

}