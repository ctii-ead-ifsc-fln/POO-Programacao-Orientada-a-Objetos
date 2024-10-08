
public class Carro {
	private String modelo;
	//Proprietario associado ao Carro
	private Proprietario proprietario;
	public Carro() {
	}
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + "]";
	}
}
