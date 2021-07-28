package banco;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta minhaConta = new Conta();
		System.out.println("Digite o numero da sua conta: ");
		minhaConta.numero = sc.nextInt();
		String lixo = sc.nextLine();
		System.out.println("Digite o nome do titular desta conta: ");
		minhaConta.titular = sc.nextLine();
		System.out.println("Conta da " + minhaConta.titular + ", numero: " + minhaConta.numero);
		System.out.println("Digite o saldo inicial desta conta: ");
		minhaConta.saldo = sc.nextDouble();
		System.out.println("Seu saldo atual e R$ " + minhaConta.saldo);
		System.out.println("Digite quanto quer sacar: ");
		minhaConta.sacar(sc.nextDouble());
		System.out.println("Seu saldo atual e R$ " + minhaConta.saldo);
		System.out.println("Digite quanto quer depositar: ");
		minhaConta.depositar(sc.nextDouble());
		System.out.println("Seu saldo atual e R$ " + minhaConta.saldo);
		
		sc.close();
	}
}
