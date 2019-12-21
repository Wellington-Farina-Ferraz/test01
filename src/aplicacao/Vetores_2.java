package aplicacao;

import java.util.Scanner;
import entities.Product_Vetor;

public class Vetores_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product_Vetor[] vect = new Product_Vetor[n];
		
		for (int i=0; i<vect.length; i++) {
		sc.nextLine();		
		String nome = sc.nextLine();
		double preco = sc.nextDouble();
		vect[i] = new Product_Vetor(nome, preco);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPreco();
		}
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
