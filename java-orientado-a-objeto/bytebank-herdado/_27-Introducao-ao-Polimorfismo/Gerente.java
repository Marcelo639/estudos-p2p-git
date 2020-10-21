//_27-Introducao-ao-Polimorfismo

public class Gerente extends Funcionario {

	// Atributos.
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	// Metodo comum.
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

//	public double getBonificacao() {
//		return this.salario;
//	}

	// Bonificacao = bonificacao de TODOS os funcionarios + salario;
	public double getBonificacao() {
		//return (this.salario * 0.1) + super.salario;
		//return (super.getBonificacao() + super.salario);
		return (super.getBonificacao() + super.getSalario());
	}
}
