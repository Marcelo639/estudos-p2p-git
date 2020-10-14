
public class Conta {

	// Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // Objetos DA CLASSE! "static" DA CLASSE!

	// Método Construtor
	public Conta(int agencia, int numero) { // Método construtor com parâmetros.
		// total++;
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}

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

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero: Não pode ter valor meno ou igual a zero.");
			return; // Para a execução.
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia: Não pode ter valor meno ou igual a zero.");
			return; // Para a execução.
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}
