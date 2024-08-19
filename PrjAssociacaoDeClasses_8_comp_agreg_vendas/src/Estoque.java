
public class Estoque {
	private int quantidade;
	private int qtdMaxima;
	private int qtdMinima;
	public int getQtdMaxima() {
		return qtdMaxima;
	}
	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public int getQuantidade() {
		return quantidade;
	}
	//para o encapsulamento, não há o método setQuantidade
	//Os métodos e repor e retirar controlam a quantidade
	public void repor(int qtd) {
		this.quantidade += qtd;
	}
	public void retirar(int qtd) {
		this.quantidade -= qtd;
	}
	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + ", qtdMaxima=" + qtdMaxima + ", qtdMinima=" + qtdMinima + "]";
	}
	
}
