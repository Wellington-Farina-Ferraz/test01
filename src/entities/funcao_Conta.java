package entities;

public class funcao_Conta {
	
	private String nome;
	private int conta;
	private double saldo;	
	private static double TAXA = 5.00;
	
	
	public funcao_Conta() {
		
	}
	
	public funcao_Conta(String nome, int conta, double saldoinicial) {
		
		this.nome = nome;
		this.conta = conta;
		this.saldo = (saldoinicial);
	}
	
	public funcao_Conta(String nome, int conta) {
		
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	//METODP DE CALCULO
	public void addSaldo(double inclusa) {
		 saldo += inclusa;
	}
	
	public void removeSaldo(double retirada) {
		saldo -= retirada+TAXA;
	}
	

	public String toString() {

		return 
				"NUMERO DA CONTA: " 
				+ conta
				+", "
				+"Cliente: "
				+ nome 
				+ ",  " 
				+"Saldo R$: " 
				+String.format("%.2f", saldo);

	}
	

}
