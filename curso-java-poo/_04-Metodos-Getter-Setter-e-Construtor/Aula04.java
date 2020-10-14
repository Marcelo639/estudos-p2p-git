
package aula04;
public class Aula04 {
    public static void main(String[] args) {
        
//        //Método 01
//        Caneta c1 = new Caneta();
//        c1.setModelo("BIC");
//        //c1.modelo = "BIC";  // ERRO, pois, meu método ter que ser privado.        
//        c1.setPonta(0.5f);
//        //c1.ponta = 0.5f; // ERRO, pois, meu método ter que ser privado.        
//        //c1.status();
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

         //Caneta c1 = new Caneta();// ERRO - Tem que ter um construtor COM PARÂMETRO.
         Caneta c1 = new Caneta("Faber Castel", "Preta", 0.3f, true);
         c1.status();
         
         Caneta c2 = new Caneta("Compac", "Vermelha", 0.5f, true);
         c2.status();
    }
}
