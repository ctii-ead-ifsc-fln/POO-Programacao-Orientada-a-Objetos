package br.edu.ifsc.fln.domain;
import br.edu.ifsc.fln.exceptions.EstoqueException;

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
	//para o encapsulamento, não há o método setQuantidade
	//Os métodos e repor e retirar controlam a quantidade
	public void repor(int qtd) throws EstoqueException {
		if (situacao != ESituacao.ATIVO) {
			//Lança a exceção EstoqueException se a situação for diferente de ATIVO
			throw new EstoqueException("O estoque não pode ser movimentado!\nSituação: " + situacao.getDescricao());
		} else if (qtd > (this.quantidade + this.qtdMaxima)) {
			//Lança a exceção EstoqueException se a quantidade de reposição for maior que a capacidade do estoque
			throw new EstoqueException("A quantidade de retirada é maior que a disponível.");
		} else {
			this.quantidade += qtd;
		}
	}
	
	//método retirar - declara EstoqueException com throws
	public void retirar(int qtd) throws EstoqueException {
		if (situacao != ESituacao.ATIVO) {
			//Lança a exceção EstoqueException se a situação for diferente de ATIVO
			throw new EstoqueException("O estoque não pode ser movimentado!\nSituação: " + situacao.getDescricao());
		} else if (qtd > this.quantidade) {
			//Lança a exceção EstoqueException se não tiver quantidade suficiente para retirada
			throw new EstoqueException("A quantidade de retirada é maior que a disponível.");
		} else {
			this.quantidade -= qtd;
		}
	}
	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + ", qtdMaxima=" + qtdMaxima + ", qtdMinima=" + qtdMinima + "]";
	}
	
}
