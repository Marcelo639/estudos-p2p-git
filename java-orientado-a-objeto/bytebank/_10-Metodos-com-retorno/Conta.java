
public class Conta{	
	
	// Atributos
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	// Métodos ou comportamentos.
	public void deposita(double valor) {		
		// this.saldo = this.saldo + 50;
		this.saldo += 50;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;// Para a execução daquele método.
		} else {
			return false;// Para a execução daquele método.
		}
	}
	
}