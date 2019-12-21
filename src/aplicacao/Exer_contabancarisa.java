package aplicacao;

import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import entities.funcao_Conta;

public class Exer_contabancarisa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		funcao_Conta funcao;

		System.out.println(" Conta Bancaria");
		System.out.println(" ");
		System.out.print(" digite oo numero da conta: ");
		int conta = sc.nextInt();

		System.out.print(" Digite o Nome: ");
		sc.nextLine();
	    String nome = sc.nextLine();
	    
		System.out.print(" Deseje efetuar deposito( y/n)?: ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
		
			System.out.print(" digite o deposito inicial: ");
			double saldoinicial = sc.nextDouble();
			funcao = new funcao_Conta(nome, conta, saldoinicial);
						
		}
		else {
			
			funcao = new funcao_Conta(nome, conta);
			
		}
		
		//traz a data completa  do sistema ex:  Terça-feira, 12 de Novembro de 2019
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);	
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		/* Dateformat.SHORT // 03/04/10
		   Dateformat.MEDIUM // 03/04/2010
           Dateformat.LONG //3 de Abril de 2010
           Dateformat.FULL //Sábado, 3 de Abril de 2010*/
		
		//traz a data e hora do sistema ex: 12/11/2019 12:59:56
		Date hoje  = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println( sdf.format(hoje));
		
		System.out.println();
		System.out.println("Account data: " + df.format(c.getTime()));
		System.out.println("Account data: " + sdf.format(hoje));
		System.out.println(funcao);
		
		System.out.println();
		System.out.print("Digite um valor de depósito: ");
		double depositValue = sc.nextDouble();
		funcao.addSaldo(depositValue);
		System.out.println("Account data: " + df.format(c.getTime()));
		System.out.println("Account data: " + sdf.format(hoje));
		System.out.println(funcao);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		funcao.removeSaldo(withdrawValue);
		System.out.println("Account data: " + df.format(c.getTime()));
		System.out.println("Account data: " +  sdf.format(hoje));
		System.out.println(funcao);
		
		
		sc.close();

		
	}

}
