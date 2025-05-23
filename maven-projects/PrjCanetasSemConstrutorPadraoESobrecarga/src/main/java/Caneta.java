
public class Caneta {
    public String cor;
    public float ponta;
    public boolean tampada;
    public int carga = 100;
    
    //Construtor com parâmetro de entrada cor
    public Caneta(String cor) {
    	this.cor = cor;
    }
    
    //Construtor com parâmetros para todos os atributos
    public Caneta(String cor, float ponta, boolean tampada) {
    	this.cor = cor;
    	this.ponta = ponta;
    	this.tampada = tampada;
    }
}



