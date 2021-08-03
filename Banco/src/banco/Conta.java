package banco;
import java.util.Scanner;


public class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean sacar(double valor) {
		if(valor > this.saldo){
			return false;
		 }else 
		 	this.saldo -= valor;
			 return true;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
		System.out.println("\nDeposito realizado com sucesso!");
		System.out.println("\nNovo saldo: " + this.saldo + "\n");
	}


	void opcaoConsultarInformacoes(){
		System.out.println("\nNumero da conta: " + this.numero);
		System.out.println("\nTitular: " + this.titular);
		System.out.println("\nSaldo: " + this.saldo);
	}

	double opcaoSacar(Scanner sc){
		System.out.println("\nQual valor deseja sacar?");
		double valor = sc.nextDouble();
		if(this.sacar(sc.nextDouble())){
			System.out.println("\nSaque efetuado! Novo saldo e R$ " + this.saldo);
		}else{
			System.out.println("\nSaldo insuficiente!");
			System.out.println("\nSeu saldo e de apenas R$ " + this.saldo);
		}
	}

	double opcaoDepositar(){

		System.out.println("\nQual valor deseja depositar?");
		this.depositar(sc.nextDouble());
	}

}
