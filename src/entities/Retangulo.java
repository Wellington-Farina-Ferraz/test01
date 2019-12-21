package entities;

public class Retangulo {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	public String toString() {

	return 
			String.format("area = %.2f%n", area())
			+ String.format("perimeter = %.2f%n", perimeter())
			+ String.format("diagonal = %.2f%n", diagonal());

	}
}
