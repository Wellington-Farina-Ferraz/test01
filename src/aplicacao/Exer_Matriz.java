package aplicacao;

import java.util.Scanner;

public class Exer_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digital a quantidades de linhas da martriz: ");
		int l = sc.nextInt();
		System.out.println("digital a quantidades de coluna da martriz: ");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			// for percorre a coluna
			for (int j = 0; j < mat[i].length; j++) {
				// local de alocação na matriz
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("digital um numero da ocorrencia na matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");

					if (i > 0) {
						System.out.println("Up / em cima: " + mat[i - 1][j]);
					}

					if (i < mat.length - 1) {
						System.out.println("Down / em baixo: " + mat[i + 1][j]);
					}

					if (j < mat[i].length - 1) {
						System.out.println("Right / a direita: " + mat[i][j + 1]);
					}

					if (j > 0) {
						System.out.println("Left / a esquerda: " + mat[i][j - 1]);
					}

				}
			}
		}
		sc.close();
	}

}
