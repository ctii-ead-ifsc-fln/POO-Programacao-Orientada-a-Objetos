public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;
	private int limiteMaximo;
	private boolean ativo;
	
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
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getLimiteMaximo() {
		return limiteMaximo;
	}
	public void setLimiteMaximo(int limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}

