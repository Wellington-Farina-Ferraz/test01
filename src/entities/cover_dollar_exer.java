package entities;

public class cover_dollar_exer {
	
	public static final double IMP = 0.06;
	
	public static double  conversao (double VL_DOLLAR, double qtd ) {
		return VL_DOLLAR * qtd + VL_DOLLAR * qtd * IMP;				
	}

}
