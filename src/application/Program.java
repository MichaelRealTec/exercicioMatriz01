package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Matriz - Exercicio 01
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		// Criar Matriz bi-dimensional (JAVA) 
		int[][] mat = new int[n][n]; // Instancia a Matriz na memória
		
		for(int i = 0; i < n; i++) {
			// for para percorrer as linhas
			for (int j = 0; j < n; j++) {
				// for para percorrer as colunas
				mat[i][j] = sc.nextInt(); // armazenar os valores
			}
		}
		
		// Mostrar os valores da diagonal principal
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < n; i++) {
			System.out.printf(mat[i][i] + " ");
		}
		
		// Fim diagonal principal
		System.out.println();
		// Mostrar a quantidade de números negativos
		int count = 0; // contador para somar os números negativos digitados
		
		for(int i = 0; i < mat.length; i++) { // mat.length = percorrer todos elementos da linha da matriz mat
			for(int j = 0; j < mat[i].length; j++) { // mat[i].length = percorre todos os elementos da coluna da matriz mat
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		// Fim mostrar os números negativos
		
		sc.close();
	}

}
