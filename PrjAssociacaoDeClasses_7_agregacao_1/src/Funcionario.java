
public class Funcionario {
	private int matricula;
	private String nome;

    public Funcionario(int matricula, String nome) {
    	this.matricula = matricula;
        this.nome = nome;
    }

    // Getters e setters
    public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
