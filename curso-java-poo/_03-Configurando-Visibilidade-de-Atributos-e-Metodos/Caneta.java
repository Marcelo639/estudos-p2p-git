
package aula03;
public class Caneta {

    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    // protected boolean tampada;
    private boolean tampada;
    
    // Metodos
    public void statusr(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada );
    }
       
    // private void rabiscar(){
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }
    
    // protected void tampar(){
    public void tampar(){
        this.tampada = true;
    }
    
    // protected void destampar(){
    public  void destampar(){
       this.tampada = false;
    }
}
