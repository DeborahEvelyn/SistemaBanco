package Aplicacoes;

public class ContaCorrente extends ContaBancaria
{
	private int talonario;
	
	public ContaCorrente()
	{
		
	}
	
	public ContaCorrente(int numero, int talonario) {
		super(numero);
		this.talonario = talonario;
	}

	public ContaCorrente(int talonario) {
		super();
		this.talonario = talonario;
	}

	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}

      
	
}
