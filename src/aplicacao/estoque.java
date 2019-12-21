package aplicacao;

import java.util.Scanner;
import entities.Products;

public class estoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		Products products = new Products();
		
		
		System.out.println(" Entre com o produto: ");
		
		System.out.print("Nome");
		products.nome = sc.nextLine();
		
		System.out.print("Preco");
		products.price = sc.nextDouble();
		
		System.out.print("Quatidade no estoque");
		products.quantity = sc.nextInt();
		
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
