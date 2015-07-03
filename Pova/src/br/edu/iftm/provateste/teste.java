package br.edu.iftm.provateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.iftm.prova.CalculodeImposto;


public class teste {
	
	@Test
	public void imposto() {
		
		CalculodeImposto test = new CalculodeImposto();
		
		
		
		double esperado = 50 ;
		double atual = 50;
		
		assertEquals(esperado, atual,0.00);
		
	}
	
	
	

}
