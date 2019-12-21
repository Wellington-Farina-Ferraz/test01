package aplicacao;

import java.util.Scanner;
import entities.Retangulo;

public class exe_retangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Retangulo retan = new Retangulo();

		System.out.println(" Entre com a area do retagulo ");

		retan.width = sc.nextDouble();
		retan.height = sc.nextDouble();

		System.out.println(retan);
		
		sc.close();

	}

}
