
public class Estoque {
	private int quantidade;
	private int qtdMaxima;
	private int qtdMinima;
	
	private ESituacao situacao = ESituacao.BLOQUEADO;
	
	public ESituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(ESituacao situacao) {
		this.situacao = situacao;
	}
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
	
	//Controlando a movimentação do estoque pela "situacao"
	public void repor(int qtd) {
		if (situacao == ESituacao.ATIVO) {
			this.quantidade += qtd;
		} 
	}
	public void retirar(int qtd) {
		if (situacao == ESituacao.ATIVO) {
			this.quantidade -= qtd;
		}
	}
	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + ", qtdMaxima=" + qtdMaxima + ", qtdMinima=" + qtdMinima + "]";
	}
	
}
