package Aplicacoes;

public class ContaEspecial extends ContaCorrente
{
	private double limite;

	public ContaEspecial() {
		
	}
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
