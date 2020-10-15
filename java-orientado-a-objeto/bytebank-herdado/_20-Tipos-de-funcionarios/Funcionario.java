
public class Funcionario {

	// Atributos.
	private String nome;
	private String cpf;
	private double salario;	

	// Metodo Construtor
	public Funcionario() {
		super();
	}

	// Metodos especiais.
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
