package Aplicacoes;

public class ContaPoupanca extends ContaBancaria
{
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	public ContaPoupanca()
	{
		
	}
	
	public ContaPoupanca(double juros, double corrMonetaria, int mesAniversario) {
		super();
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrMonetaria() {
		return corrMonetaria;
	}

	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	
}
