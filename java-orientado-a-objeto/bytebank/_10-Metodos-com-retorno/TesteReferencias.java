
public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;// Clone de objetos(segundaConta -> primeiraConta)
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta!");
		}
		
		System.out.println(primeiraConta);// Objetos sem mostrar os atributos com contas iguais.
		System.out.println(segundaConta);// Objetos sem mostrar os atributos com contas iguais.
	}
}
