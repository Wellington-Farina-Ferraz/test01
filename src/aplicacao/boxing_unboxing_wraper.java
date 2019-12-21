package aplicacao;

public class boxing_unboxing_wraper {

	public static void main(String[] args) {
		
		int x = 20;
		
		
		
		//boxing
		Object obj = x;
		System.out.println(obj);
		
		//unboxing_ obrigatorio indicar o tipo da variavel enter parentes
		int y = (int) obj*2;
		System.out.println(y);
		
		//wrapper
		Integer ob = y*2;
		System.out.println(ob);
		
		
		
	}

}
