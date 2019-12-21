package aplicacao;

import java.util.Scanner;
import entities.Nota_Aluno;

public class av_aluno {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Nota_Aluno Nota = new Nota_Aluno();
		
		Nota.nome = sc.nextLine();
		Nota.n1 = sc.nextDouble();
		Nota.n2 = sc.nextDouble();
		Nota.n3 = sc.nextDouble();
		
		if(Nota.notaFinal() < 60.0) {
			
			System.out.println("nome: " + Nota.nome); 
			System.out.printf("Nota final: %.2f%n", Nota.notaFinal());
			System.out.printf("Reprovado faltou %.2f pontos ", Nota.verificarNota());
						
		}
		else {
			
			System.out.println("nome: " + Nota.nome);
			System.out.printf("Aprovado Nota final: %.2f%n", Nota.notaFinal());			
		
		}
		
		sc.close();

	}

}
