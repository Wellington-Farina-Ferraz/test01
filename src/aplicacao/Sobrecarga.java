package aplicacao;

import java.util.Scanner;
import entities.Contruto_Product;

public class Sobrecarga {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner (System.in);
			
			System.out.println(" Entre com o produto: ");
			
			System.out.print("Nome: ");
		    String nome = sc.nextLine();
			
			System.out.print("Preco: ");
			double price = sc.nextDouble();
					
			Contruto_Product products = new Contruto_Product(nome, price);
			
			System.out.println( products );
			
			System.out.println( );
			System.out.print(" deseja entra com um novo produto no stock: ");
			int quantity = sc.nextInt();
			products.addProducts(quantity);
			
			System.out.println( );
			System.out.println(" updated data: " + products);
			
			System.out.println( );
			System.out.print(" deseja retira  um  produto no stock: ");
			quantity = sc.nextInt();
			products.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + products);
					
			sc.close();

		}

	}
