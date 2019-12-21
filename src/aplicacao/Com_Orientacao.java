package aplicacao;

import java.util.Scanner;
import entities.Triangulo;

public class Com_Orientacao {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Triangulo x, y;
			x = new Triangulo();
			y = new Triangulo();
			
			System.out.println("Enter the measures of triangle X: ");
			x.A = sc.nextDouble();
			x.B = sc.nextDouble();
			x.C = sc.nextDouble();
			
			System.out.println("Enter the measures of triangle Y: ");
			y.A = sc.nextDouble();
			y.B = sc.nextDouble();
			y.C = sc.nextDouble();
			
			double p = (x.A + x.B + x.C) / 2.0;
			
			double areaX = Math.sqrt(p * (p - x.A) * (p - x.B) * (p - x.C));
			
			p = (y.A + y.B + y.C) / 2.0;
			
			double areaY = Math.sqrt(p * (p - y.A) * (p - y.B) * (p - y.C));
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);
			
			if (areaX > areaY) {
			
				System.out.println("Larger area: X");
				
			}
			else {
			
				System.out.println("Larger area: Y");
				
			}
			
			sc.close();
			
			}


}
