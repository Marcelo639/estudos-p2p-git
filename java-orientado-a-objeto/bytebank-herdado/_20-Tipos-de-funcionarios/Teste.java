
public class Teste {

	public static void main(String[] args) {
		
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setTipo(0);
		f1.setSalario(3000.0);
		System.out.println("Tipo: " + f1.getTipo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Bonificacao: " + f1.getBonificacao());
		
		System.out.println("");
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(1);
		f2.setSalario(5000.0);
		System.out.println("Tipo: " + f2.getTipo());
		System.out.println("Salario: " + f2.getSalario());
		System.out.println("Bonificacao: " + f2.getBonificacao());

		System.out.println("");
		
		FuncionarioTeste f3 = new FuncionarioTeste();
		f3.setTipo(2);
		f3.setSalario(5000.0);
		System.out.println("Tipo: " + f3.getTipo());
		System.out.println("Salario: " + f3.getSalario());
		System.out.println("Bonificacao: " + f3.getBonificacao());		
	}
}
