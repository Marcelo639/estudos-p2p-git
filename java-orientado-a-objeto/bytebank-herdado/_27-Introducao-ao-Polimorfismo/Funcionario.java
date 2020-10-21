//_27-Introducao-ao-Polimorfismo

public class Funcionario {

	//Atributos.
	private String nome;
	private String cpf;
	//protected double salario; // Publico SOMENTE PARA OS FILHOS.
	private double salario;

	//Metodo Construtor
	public Funcionario() {
		super();
	}

	//Metodos especiais.
	public double getBonificacao() {
		return this.salario * 0.05;
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
