package aplicacao;

import java.util.Scanner;
import entities.Ent_Exer_Vetores;

public class exer_vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("digite a quatidade de quartos: ");
		int x = sc.nextInt();
		System.out.println(" ");
		
		Ent_Exer_Vetores[] vect = new Ent_Exer_Vetores[x];

		System.out.println("Quantos quartos serão alugados?: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Ent_Exer_Vetores(nome, email);
		}

		System.out.println();
		System.out.println("Busy rooms / Quartos ocupados:");
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

			sc.close();

		}
	}

}
