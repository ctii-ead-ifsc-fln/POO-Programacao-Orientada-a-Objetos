
public class Nacional extends Fornecedor {
	private String cnpj;

    public Nacional() {
		super();
	}

	public Nacional(int id, String nome, String email, String fone, String cnpj) {
		super(id, nome, email, fone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Nacional [cnpj=" + cnpj + "]";
	}
	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getDados());
		sb.append("CNPJ...........: ").append(cnpj).append("\n");
		return sb.toString();
	}
	@Override
	public String getDados(String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(getDados()).append(msg).append("\n");
		return sb.toString();
	}
	
}
