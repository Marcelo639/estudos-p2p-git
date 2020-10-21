//_27-Introducao-ao-Polimorfismo

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("123.456.789-0");
		nico.setSalario(2600.0);

		System.out.println("Nome: " + nico.getNome());
		System.out.println("Bonificacao: " + nico.getBonificacao());
		
		//nico.salario = 300.0;
	}
}
