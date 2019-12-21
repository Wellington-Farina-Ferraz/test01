package entities;

public class encapsula_prod {

	private String nome;
	private double price;
	private int quantity;

	public encapsula_prod() {

	}
	
	public encapsula_prod(String nome, double price, int quantity) {

		this.nome = nome;
		this.price = price;
		this.quantity = quantity;

	}

	// sobrecarga
	public encapsula_prod(String nome, double price) {

		this.nome = nome;
		this.price = price;

	}

	
	// metodo encapsulado
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {

		return nome;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {

		return price;
	}

	public double getquantity() {

		return quantity;
	}
	// fim do encapsulador
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {

		return nome + ", $ " + String.format("%.2f", price) + ", " + quantity + " unitd, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

}
