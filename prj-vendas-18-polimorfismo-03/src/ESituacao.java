
public enum ESituacao {
	ATIVO("Ativo", "Permite a movimentação."), 
	INATIVO("Inativo", "Movimentações não permitidas."), 
	BLOQUEADO("Bloqueado", "Movimentações bloqueadas.");

	private String descricao;
	private String detalhamento;
	
	private ESituacao(String descrciao, String detalhamento) {
		this.descricao = descrciao;
		this.detalhamento = detalhamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getDetalhamento() {
		return detalhamento;
	}
}
