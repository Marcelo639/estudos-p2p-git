
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		
		g1.setNome("Ivan");
		g1.setCpf("678.901.234-56");
		g1.setSalario(5000.0);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salario: " + g1.getSalario());
		
		// Autenticacao.
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println("Autenticacao: " + autenticou);
	}
}
