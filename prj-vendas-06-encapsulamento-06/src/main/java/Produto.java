public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;
	private int limiteMaximo;
	private boolean ativo;
	public void setLimiteMaximo(int limiteMaximo) {
		if (limiteMaximo >= 0) {
			this.limiteMaximo = limiteMaximo;
		}
	}
	public void repor(int quantidade) {
		if (quantidade > 0 && 
				(quantidade + this.quantidade) <= this.limiteMaximo) {
			this.quantidade += quantidade;
		}
	}
	public void retirar(int quantidade) {
		if (quantidade > 0 && 
				quantidade <= this.quantidade) {
			this.quantidade -= quantidade;
		}
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	public int getLimiteMaximo() {
		return limiteMaximo;
	}

}

