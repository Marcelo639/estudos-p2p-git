
package aula04;
public class Caneta {
    
    //public String modelo;
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
//    public Caneta(){//Método construtor.
//        this.tampar();
//        this.cor = "Azul";        
//    }
    
     public Caneta(String m, String c, float p, boolean t){//Método construtor com parâmetro.
         this.modelo = m; 
         this.cor = c; 
         this.ponta = p; 
         this.tampada = t; 
         this.tampar();               
    }
    
    public  String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");        
        //System.out.println("Modelo: " + this.modelo);
        System.out.println("Modelo: " + this.getModelo());        
        //System.out.println("Ponta: " + this.ponta);
        System.out.println("Ponta: " + this.getPonta());        
        System.out.println("Ponta: " + this.cor);
        System.out.println("Ponta: " + this.tampada);        
    }
    
    public  void tampar(){
        this.tampada = true;
    }
    
    public  void destampar(){
        this.tampada = false;
    }
}
