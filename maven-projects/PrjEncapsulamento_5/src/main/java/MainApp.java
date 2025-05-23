public class MainApp {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setNome("Notebook");
		produto.setPreco(3500.0);
		produto.setQuantidade(-100);//entrada negativa
		produto.setLimiteMaximo(-200);//entrada negativa
		produto.setAtivo(true);
		System.out.println("Código....: " 
				+ produto.getCodigo());
		System.out.println("Nome......: " 
				+ produto.getNome());
		System.out.println("Preco.....: " 
				+ produto.getPreco());
		System.out.println("Quantidade: " 
				+ produto.getQuantidade());
		System.out.println("Lim. Max..: " 
				+ produto.getLimiteMaximo());
		System.out.println("Ativo.....: " 
				+ produto.isAtivo());
	}
}

