package banco;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta minhaConta = new Conta();
		System.out.println("Digite o numero da sua conta: ");
		minhaConta.numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular desta conta: ");
		minhaConta.titular = sc.nextLine();
		System.out.println("Titular: " + minhaConta.titular + ", numero da conta: " + minhaConta.numero);
		System.out.println("Digite o saldo inicial desta conta: ");
		minhaConta.saldo = sc.nextDouble();
		System.out.println("Saldo atual: R$ " + minhaConta.saldo);
		System.out.println("Digite quanto deseja sacar: ");
		minhaConta.sacar(sc.nextDouble());
		System.out.println("Seu atual: R$ " + minhaConta.saldo);
		System.out.println("Digite quanto deseja depositar: ");
		minhaConta.depositar(sc.nextDouble());
		System.out.println("Saldo atual: R$ " + minhaConta.saldo);


		int opcao = 0;
		while(opcao != 4){
			System.out.println("1 - Consultar Informações\n2 - Sacar\n3 - Depositar\n4 - Sair da Aplicacao");
			opcao = sc.nextInt();
			
			double valor = sc.nextDouble();
			switch(opcao){
				case 1 :	minhaConta.opcaoConsultarInformacoes();	break;
				case 2 :	minhaConta.saldo -= minhaConta.opcaoSacar(sc);		break; //colocar uma entrada aqui
				case 3 :	minhaConta.opcaoDepositar();			break;
				default:	System.out.println("Say goodbye!");		break;
			}
		}
		sc.close();
	}
}