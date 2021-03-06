
public class Conta{	
	
	// Atributos
	private double saldo;	
	private int agencia;
	private int numero;
	private Cliente titular;
	
	// Métodos ou comportamentos.
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;// Para a execução daquele método.
		} else {
			return false;// Para a execução daquele método.
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	// public double pegaSaldo() {
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	// public void setNumero(int novoNumero) {
	public void setNumero(int numero) {
		// this.numero = novoNumero;
		this.numero = numero;
	}
		
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}	
}
