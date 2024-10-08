import java.util.ArrayList;
import java.util.List;

public class Proprietario {
	private String nome;
	//uma lista de Carros associado ao Proprietario
	private List<Carro> listaDeCarros = new ArrayList<>();

	public Proprietario() {
	}
	public Proprietario(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//método para adicionar Carro a lista de carros do proprietário
	public void addCarro(Carro carro) {
		listaDeCarros.add(carro);
		carro.setProprietario(this);
	}
	public List<Carro> getListaDeCarros() {
		return listaDeCarros;
	}
	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", listaDeCarros=" + listaDeCarros + "]";
	}
}
