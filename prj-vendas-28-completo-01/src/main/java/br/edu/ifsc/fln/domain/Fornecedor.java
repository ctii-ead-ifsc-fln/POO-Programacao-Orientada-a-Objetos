package br.edu.ifsc.fln.domain;
import java.util.ArrayList;
import java.util.List;

public abstract class Fornecedor implements IResumoDados {
	private int id;
	private String nome;
	private String email;
	private String fone;
	//Lista de produtos do fornecedor
	private List<Produto> produtos = new ArrayList<>();
	public Fornecedor() {
		super();
	}
	public Fornecedor(int id, String nome, String email, String fone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	//Método para realizar a associação bidirecional
	//(1) adiciona o produto a lista de produtos do fornecedor
	//(2) associa o fornecedor (this) ao objeto produto
	public void add(Produto produto) {
		this.produtos.add(produto);
		produto.setFornecedor(this);
	}
	//Método para remover um produto da lista, mas não o exclui da memória
    public void remove(Produto produto) {
		this.produtos.remove(produto);
		produto.setFornecedor(null);
	}
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", produtos="
				+ produtos + "]";
	}
	
	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome...........: ").append(nome).append("\n");
		sb.append("Email..........: ").append(email).append("\n");
		sb.append("Fone...........: ").append(fone).append("\n");
		sb.append("Nome...........: ").append(nome).append("\n");
		return sb.toString();
	}
	@Override
	public String getDados(String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(getDados()).append(msg).append("\n");
		return sb.toString();
	}
	
}
