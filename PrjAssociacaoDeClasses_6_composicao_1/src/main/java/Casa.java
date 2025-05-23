import java.util.ArrayList;
import java.util.List;

public class Casa {
	private String tipo;
    private List<Comodo> comodos;

    public Casa(String tipo) {
    	this.tipo = tipo;
        this.comodos = new ArrayList<>();
    }

    // Método para adicionar cômodos
    public void adicionarComodo(String nome) {
        Comodo comodo = new Comodo(nome);
        this.comodos.add(comodo);
    }

    // Na composição apenas o método get deve ser implementado
    // para não quebrar a regra de negócio
    public List<Comodo> getComodos() {
        return comodos;
    }

    // Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
}
