package principal;

import java.util.Scanner;

import Aplicacoes.ContaBancaria;
public class Principal2 {
	public static void main(String[] args) {		
		int opc,dep;
		
	
		
		
		Scanner tec = new Scanner(System.in);	
        System.out.println("Bem vindo ao Banco SquEd ");
		System.out.println("\nEscolha uma opc�es abaixo para prosseguir: ");
		System.out.println("\n1-Conta Corrente");
		System.out.println("2-Conta Poupan�a ");
		opc = tec.nextInt();
		if (opc==1)
		{
			System.out.println("\nOp��o 1-Conta Corrente escolhida ");
			System.out.println("\n Informe o numero de conta :");
			int contaCorrente = tec.nextInt();
			System.out.println("\nBEM VINDO CLIENTE !!");
			System.out.printf("\nCONTA CORRENTE:%d ",contaCorrente);
			System.out.println("\nInforme o servi�o desejado ");
			System.out.println("\nOp��o 1-Deposito ");
			System.out.println("Op��o 2-Saldo ");
			System.out.println("Op��o 3-Extrato Conta corrente ");
			opc = tec.nextInt();
// entrada de opcao conta corrente
			if(opc==1)
			{			
				System.out.println("\n1 QUAL � O VALOR DO DEPOSITO? ");
				dep = tec.nextInt();
			}
				if(opc==2)
			{	
				System.out.println("\nSEU SALDO DA CONTA CORRENTE: ");
			}
				if(opc==3)
			{
				System.out.println("\nEXTRATO CONTA CORRENTE: ");
			}
			}
		else if (opc==2)
		{
			System.out.println("\nOp��o 2-Conta Poupan�a escolhida ");
			System.out.println("\n Informe o numero de conta: ");
			int contaPoupanca = tec.nextInt();
			System.out.println("\nBEM VINDO CLIENTE!");
			System.out.printf("\nCONTA CORRENTE:%d ",contaPoupanca);
			System.out.println("\nInforme o servi�o desejado: ");
			System.out.println("\nOp��o 1-Deposito ");
			System.out.println("Op��o 2-Saldo: ");
			System.out.println("Op��o 3-Extrato Conta corrente: ");
			opc = tec.nextInt();
			if(opc==1)
			{			
				System.out.println("\n1 QUAL � O VALOR DO DEPOSITO? ");
				dep = tec.nextInt();
			}
				if(opc==2)
			{	
				System.out.println("\nSALDO CONTA POUPAN�A: ");
			}
				if(opc==3)
			{
				System.out.println("\nEXTRATO CONTA POUPAN�A: ");
			}
		}
		
		
		
		
	}
}