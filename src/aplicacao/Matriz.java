package aplicacao;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//inticaçãp do tamanho da matriz
		System.out.println("digital qual a martriz que deseja montar:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		System.out.println();
		
		System.out.println("digital a sua  martriz:");
		//for que percorre a linha 
		for (int i = 0; i < mat.length; i++) {
			//for percorre a coluna 
			for (int j = 0; j < mat[i].length; j++) {
				//local de alocação na matriz
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		//impressao da diagonal principal
		System.out.println("Main diagonal / diagonal principal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.println();
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();

	}

}
