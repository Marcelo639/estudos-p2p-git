//_27-Introducao-ao-Polimorfismo

public class TesteReferencias {

	public static void main(String[] args) {

		//Gerente g1 = new Gerente();
		
		//No exemplo abaixo, vamos usar uma classe mais generica.
		Funcionario g1/*classe 'mãe'*/ = new Gerente();/*classe 'filha'*/
		
		//Gerente g1 = new Funcionario();// ERRO! Pois os 'Funcionario' serão todos 'Gerente'.
		
		//g1.autentica(2222);//ERRO. O 'autentica' é para TODA a classe 'Gerente', e não para 'Funcionario'.
		
		g1.setNome("Marcia");
		String nome = g1.getNome();
		System.out.println("Nome: " + nome);
	}
}
