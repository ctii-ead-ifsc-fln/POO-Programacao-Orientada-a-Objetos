package br.edu.ifsc.fln.domain;
import java.math.BigDecimal;
public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	//associação unidirecional com a classe Categoria
	private Categoria categoria;
	//associação do produto com o Fornecedor
	private Fornecedor fornecedor;
	//associação por composicão com Estoque
	private Estoque estoque = new Estoque();
	
	public Produto() { 	
	}
	public Produto(int id, String nome, String descricao, BigDecimal preco, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}
	//Implementação apenas do método get para Estoque. Pela composição 
	//se deve implementar o método set, pois permitiria passar uma instância
	//de um objeto Estoque, descaracterizando a composição.
	public Estoque getEstoque() {
		return estoque;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", categoria="
				+ categoria + ", fornecedor=" + fornecedor + ", estoque=" + estoque + "]";
	}
	
}