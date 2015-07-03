package br.edu.iftm.prova;

public class CalculodeImposto {

	private double valordoProdutoemDolar = 0.00;
	private double cotacaoDolarDia = 0.00;
	private double calculoDolareCotacao = 0.00;
	private double alicota = 0.00;
	private double calculoAlicotaemip = 0.00;
	private double calculoGeral = 0.00;
	
		
	public double getValordoProdutoemDolar() {
		return valordoProdutoemDolar;
	}
	public void setValordoProdutoemDolar(double valordoProdutoemDolar) {
		this.valordoProdutoemDolar = valordoProdutoemDolar;
	}
	
	
	public double getCotacaoDolarDia() {
		return cotacaoDolarDia;
	}
	public void setCotacaoDolarDia(double cotacaoDolarDia) {
		this.cotacaoDolarDia = cotacaoDolarDia;
	}
	
		
	public double getCalculoDolareCotacao() {
		return calculoDolareCotacao;
	}
	public void setCalculoDolareCotacao(double calculoDolareCotacao) {
		this.calculoDolareCotacao = calculoDolareCotacao;
	}	
	
	
	public double getCalculoAlicotaemip() {
		return calculoAlicotaemip;
	}
	public void setCalculoAlicotaemip(double calculoAlicotaemip) {
		this.calculoAlicotaemip = calculoAlicotaemip;
	}
	
	
	public double getAlicota() {
		return alicota;
		
	}
	public void setAlicota(double alicota) {
		
		this.alicota = alicota;			
	}	
	
	
	public double getCalculoGeral() {
		return calculoGeral;
	}
	public void setCalculoGeral(double calculoGeral) {
		this.calculoGeral = calculoGeral;
	}
	
	
	public double calculo_imposto(){
		
		this.calculoAlicotaemip = this.alicota / 100;
		
		
		if (calculoAlicotaemip == 20.00 && calculoAlicotaemip <= 120){
		
		this.calculoDolareCotacao = this.cotacaoDolarDia * this.valordoProdutoemDolar;
		
		this.calculoGeral = this.calculoDolareCotacao * this.calculoAlicotaemip;
		
		}
		else{
			
			this.calculoDolareCotacao = this.cotacaoDolarDia * this.valordoProdutoemDolar;
			
			this.calculoGeral = this.calculoDolareCotacao * this.calculoAlicotaemip;			
			
		}
		
		
		
		
		;
		
		
		
		return 0;
		
}
	
	
	
	
	
	
}
