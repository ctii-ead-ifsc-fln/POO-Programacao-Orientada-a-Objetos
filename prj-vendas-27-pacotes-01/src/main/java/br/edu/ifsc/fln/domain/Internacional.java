package br.edu.ifsc.fln.domain;

public class Internacional extends Fornecedor {
	private String pais;
	private String nif;
	
	public Internacional() {
		super();
	}
	public Internacional(int id, String nome, String email, String fone, String pais, String nif) {
		super(id, nome, email, fone);
		// TODO Auto-generated constructor stub
		this.pais = pais;
		this.nif = nif;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	@Override
	public String toString() {
		return "Internacional [pais=" + pais + ", nif=" + nif + "]";
	}
	
	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getDados());
		sb.append("NIF............: ").append(nif).append("\n");
		sb.append("País...........: ").append(pais).append("\n");
		return sb.toString();
	}
	@Override
	public String getDados(String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(getDados()).append(msg).append("\n");
		return sb.toString();
	}	
	
}
