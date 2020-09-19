package Aplicacoes;

public class ContaEmpresa extends ContaBancaria
{
	private double limiteEmpresa;

	public ContaEmpresa() {
		
	}
	
	public ContaEmpresa(double limiteEmpresa) {
		super();
		this.limiteEmpresa = limiteEmpresa;
	}

	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	
}