
public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta contaDoPaulo= new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);		
		
		// contaDoPaulo.saca(20);
		boolean conseguiuRetirar =	contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Marcela: " +  contaDaMarcela.saldo);
		
		// Transferencia.
//		contaDaMarcela.transfere(300, contaDoPaulo);
		
//		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso.");
		} else {
			System.out.println("faltou dinheiro.");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		 
	}
}

}
