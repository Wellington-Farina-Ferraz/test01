package aplicacao;

import java.util.Scanner;
import entities.cover_dollar_exer;

public class Compra_dollar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter Com valor do dollar: ");
		double VL_DOLLAR = sc.nextDouble();
		
		System.out.print("VALOR QUE DESEJA COMPRAR: ");
		double qtd = sc.nextDouble();
		
		double c = cover_dollar_exer.conversao(VL_DOLLAR, qtd);
		
		System.out.printf("vl: %.2f%n", c);
		System.out.printf("Valor do Imposto: %.2f%n ", cover_dollar_exer.IMP);
		
		sc.close();

	}

}
