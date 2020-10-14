
public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		// System.out.println(conta.saca(101));// Saca a operação e mostra o valor.
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo()); 
		// conta.saldo = conta.saldo - 101;// NUNCA FAÇA ISSO! Use os métodos.
		
		// conta.numero = 1377;// alterar valor diretamente sem usar o "get"		
	}

}
