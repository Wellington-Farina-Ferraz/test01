package aplicacao;

import java.util.Scanner;
import entities.Sal_Employee;

public class Employee_exer {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Sal_Employee emp = new Sal_Employee();
				
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		
		System.out.print("Salario: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print(" which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("updated data: " + emp);
		
		
		sc.close();
		
	}

}
