package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_1 {

	public static void main(String[] args) {

		//montagem da lista 
		List <String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		//imprimir a lista 
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		// remover pro predicado o primeito caracter do nome 
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		// contra quabdidade de nome igual
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		//filtro da lista mostrando apenas com o caracter desejado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		//encontra o primeiro elemeto com a inicial
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
