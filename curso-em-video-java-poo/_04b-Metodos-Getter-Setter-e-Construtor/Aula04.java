
package aula04;
public class Aula04 {
    public static void main(String[] args) {
        
//        MÉTODO CONCEITUAL       
//        Caneta c1 = new Caneta();
//        c1.setModelo("BIC");
//        c1.setPonta(0.5f);        
//        //c1.status();
//        System.out.println("Tenho uma caneta no modelo " + c1.getModelo()
//        + " de ponta " + c1.getPonta());
            
      //Caneta c1 = new Caneta();//NO MÉTODO "CONSTRUTOR", EU NÃO PASSEI OS PARÂMETROS.
      Caneta c1 = new Caneta("Compac", "Vermelha", 0.4f);
      c1.status();
      
      Caneta c2 = new Caneta("Faber Castel", "Preta", 1.0f);
      c2.status();
    }    
}