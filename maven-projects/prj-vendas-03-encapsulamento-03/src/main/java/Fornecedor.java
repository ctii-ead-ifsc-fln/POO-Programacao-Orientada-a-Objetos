import java.util.List;

public class Fornecedor {
	private int codigo;
	private String nome;
	private double faturamento;
	private Endereco endereco;
	private List<Produto> produtos;
	private boolean ativo;
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public double getFaturamento() {
		return faturamento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
