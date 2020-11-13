
public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("--------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.setSaldo(50f);
			System.out.println("Conta aberta com sucesso!");
		} else if (t == "CP") {
			this.setSaldo(150f);
			System.out.println("Conta aberta com sucesso!");
		}		
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}

	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque.");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada.");
		}
	}

	public void pagarMensalidade() {
		int valor = 0;// variavel local

		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}

		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso!");
		} else {
			System.out.println("Impossível pagar uma conta fechada.");
		}
	}

	public ContaBanco() {
		// this.setSaldo(0);
		this.saldo = 0;
		// this.setStatus(false);
		this.status = false;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getDono() {
		return this.dono;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return this.status;
	}
}
