package entities;

public class Lista {
	
	private String nome;
	private int codigo;
	private double salario;
	
	public Lista(String nome, int codigo, double salario) {
		this.nome = nome;
		this.codigo = codigo;
		this.salario = salario;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void addsalario(double porc) {
		salario += salario * porc / 100;
	}
	
	public String toString() {
		return "codigo: "+ codigo + ", " +"Nome: "+ nome + ", " +"Salario R$: "+  String.format("%.2f", salario);}

}
