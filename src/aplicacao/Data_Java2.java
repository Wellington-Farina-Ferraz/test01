package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data_Java2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date a = new Date(System.currentTimeMillis());
		Date b = new Date(System.currentTimeMillis());
		Date c = new Date(System.currentTimeMillis());
		Date d = new Date(System.currentTimeMillis());
		Date e = new Date(System.currentTimeMillis());
		Date f = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(d));

		System.out.print("digite o tempo a acrescer: ");
		int x = sc.nextInt();

	
		Calendar cala = Calendar.getInstance();
		cala.setTime(a);
		// adicionado horas
		cala.add(Calendar.HOUR_OF_DAY, x);
		a = cala.getTime();
		System.out.println("horas acrescentadas: " + sdf.format(a));
		System.out.println(" ");
		Calendar calb = Calendar.getInstance();
		calb.setTime(b);
		// adicionado minutos
		calb.add(Calendar.MINUTE, x);
		b = calb.getTime();
		System.out.println("minutos acrescentadas: " + sdf.format(b));
		System.out.println(" ");
		Calendar calf = Calendar.getInstance();
		calf.setTime(f);
		// adicionado minutos
		calb.add(Calendar.SECOND, x);
		f = calf.getTime();
		System.out.println("Segundos acrescentadas: "+sdf.format(f));
		System.out.println(" ");
		Calendar calc = Calendar.getInstance();
		calc.setTime(c);
		// adicionado dias
		calc.add(Calendar.DATE, x);
		c = calc.getTime();
		System.out.println("dias acrescentadas: "+sdf.format(c));
		System.out.println(" ");
		Calendar cald = Calendar.getInstance();
		cald.setTime(d);
		// adicionado mes
		cald.add(Calendar.MONDAY, x);
		d = cald.getTime();
		System.out.println("meses acrescentadas: "+sdf.format(d));
		System.out.println(" ");
		Calendar cale = Calendar.getInstance();
		cale.setTime(e);
		// adicionado ano
		cale.add(Calendar.YEAR, x);
		e = cale.getTime();
		System.out.println("anos acrescentadas: "+sdf.format(e));
		sc.close();
	}

}
