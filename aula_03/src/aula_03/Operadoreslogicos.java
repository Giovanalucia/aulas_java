package aula_03;

public class Operadoreslogicos {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = 5;
		int w = 20;
		
		//Operadores Realacionais
		System.out.printf("\n %d > %d = %b ", x,y, (x > y));
		System.out.printf("\n %d < %d = %b ", x,y, (x < y));
		System.out.printf("\n %d >= %d = %b ", z,y, (z >= y));
		System.out.printf("\n %d <= %d = %b ", z,y, (z <= y));
		
		//Operadores L�gicos
		
		System.out.printf("\n (%d > %d) E (%d < %d) = %b ", x, y, z, w, ((x > y) && (z < w)));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b ", x, y, z, w, ((x > y) || (z < w)));
		System.out.printf("\n !(%d > %d) OU ! (%d < %d) = %b ", x, y, z, w, (!(x > y) || !(z < w)));

	}

}
