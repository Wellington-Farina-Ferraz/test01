package aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Lista;

public class Exer_lista {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		List<Lista> list = new ArrayList<>();
		
		// PART 1 -entrada de dados - registro de funcionarios
		
		System.out.print("Quantos fucionarios ira registrar? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("funcionario #" + i + ": ");
			System.out.print("codigo: ");
			int codigo = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Lista(nome, codigo, salario));
		}

		// PART 2 - aumento do salario do funcinario pro codigo 
		
		System.out.println();
		System.out.print("Entre com codigo do funcionari para aumento de salario: ");
		int id = sc.nextInt();
		Lista emp = list.stream().filter(x -> x.getCodigo() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Codigo de funcionario nao exite!");
		}
		else {
			System.out.print("Enter com percentual de aumento: ");
			double porc= sc.nextDouble();
			emp.addsalario(porc);
		}
		
		// PART 3 - impressao do funcionarios cadatrados 
		
		System.out.println();
		System.out.println("Lista de Funcioonarios:");
		System.out.println();
		for (Lista obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	

}
