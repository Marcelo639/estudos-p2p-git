
public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		// conta.deposita(100);
		// conta.saca(200);
		// System.out.println(conta.saca(101));// Saca a operação e mostra o valor.
		
		conta.saca(101);
		
		System.out.println(conta.pegaSaldo());
		
//		System.out.println(conta.saldo);
//		
//		conta.saldo = conta.saldo - 101;// NUNCA FAÇA ISSO! Use os métodos.
//		System.out.println(conta.saldo);
	}

}
