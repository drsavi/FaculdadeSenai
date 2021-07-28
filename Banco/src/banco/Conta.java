package banco;

public class Conta {
	int numero;
	String titular;
	double saldo;
	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}

}
