package br.edu.iftm.prova;

public class ProgImposto {

	
	public static void main(String[] args) {
		
		CalculodeImposto calc = new CalculodeImposto();
		
		calc.setValordoProdutoemDolar(5.00);
		calc.setCotacaoDolarDia(3.00);
		
		calc.setAlicota(30);
		
		
		System.out.println(calc.getCalculoDolareCotacao());
		System.out.println(calc.getCalculoAlicotaemip());		
		System.out.println(calc.getCalculoGeral());
		
		
		

	}

}
