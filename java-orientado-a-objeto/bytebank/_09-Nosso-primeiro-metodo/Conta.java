
public class Conta{	
	
	// Atributos
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	// Métodos ou comportamentos.
	public void deposita(double valor) {
		//saldo = saldo + 50;// ?
		this.saldo = this.saldo + 50;
	}
}