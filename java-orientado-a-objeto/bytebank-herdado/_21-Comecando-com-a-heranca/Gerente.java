
// Gerente herda da classe Funcionario.
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
}
