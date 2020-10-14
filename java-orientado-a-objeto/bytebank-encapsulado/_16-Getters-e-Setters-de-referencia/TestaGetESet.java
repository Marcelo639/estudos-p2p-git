
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		// conta.numero = 1337;// não compila.
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titulo = paulo;// ERRO! Olha a visibilidade!
		// conta.setTitulat(paulo);// Não exite o método que se chama ".setTitular(...);"
		
		// paulo.nome = "paulo silveira";
		paulo.setNome("paulo silveira");
		// conta.setTitular(paulo);// Conta(getTitular e setTitular) = OK!
		System.out.println(paulo.getNome());
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		//conta.getTitular().setProfissao("programador");		
		// agora, em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
