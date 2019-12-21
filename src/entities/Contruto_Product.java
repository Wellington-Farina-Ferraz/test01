package entities;

public class Contruto_Product {

	public String nome;
	public double price;
	public int quantity;

	public Contruto_Product(String nome, double price, int quantity) {

		this.nome = nome;
		this.price = price;
		this.quantity = quantity;
	
	}
	
	//sobrecarga
	public Contruto_Product(String nome, double price) {

		this.nome = nome;
		this.price = price;
	
	}
	
	public Contruto_Product() {
		
	}
	

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

		return nome 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity + " unitd, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

}
