package principal;

import java.util.Scanner;

import Aplicacoes.ContaCorrente;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		ContaCorrente conta1 = new ContaCorrente();
		
		System.out.println("Digite o valor do deposito: ");
		conta1.setDeposito(teclado.nextDouble());
		System.out.println("Digite o valor do saque: ");
		conta1.setSaque(teclado.nextDouble());
		System.out.println("------------EXTRATO-------------");
		conta1.emiteExtrato();
	}

}
