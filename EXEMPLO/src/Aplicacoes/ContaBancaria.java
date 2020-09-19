package Aplicacoes;

public abstract class ContaBancaria 
{
	private int numero;
	private double saldo;
	private double deposito;
	private double saque;
	
	
	//Constructor
	
	public ContaBancaria() 
	{
		
	}

	public ContaBancaria(int numero) 
	{
		this.numero = numero;
	}

	//Getters and Setters
	
	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public double getSaldo() 
	{
		return saldo;
	}


	public double getDeposito() 
	{
		return deposito;
	}

	public void setDeposito(double deposito) 
	{
		this.deposito = deposito;
	}

	public double getSaque() 
	{
		return saque;
	}

	public void setSaque(double saque) 
	{
		this.saque = saque;
	}

	// Metodos
	
	public void emiteExtrato() 
	{
		this.saldo = (this.deposito - this.saque);
		System.out.println("Deposido: "+ this.deposito);
		System.out.println("Saque: "+ this.saque);
		System.out.println("Saldo: "+ this.saldo);
	}
	
	public double transacoes() 
	{
		System.out.println("Deposido: "+ this.deposito);
		System.out.println("Saque: "+ this.saque);
		System.out.println("Saldo: "+ this.saldo);
		return 0;
		
	}
	
	
	public double saldoAposDeposito()
	{
		deposito = this.deposito+this.saldo;
		return deposito;
	}
	
	
	}
