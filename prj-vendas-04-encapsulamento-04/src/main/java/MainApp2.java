public class MainApp2 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		//Definindo valor aos atributos do objeto com setters
		//O valor é enviado como argumento em uma mensagem
		produto.setCodigo(1);
		produto.setNome("Notebook");
		produto.setPreco(3500.0);
		produto.setQuantidade(100);
		produto.setLimiteMaximo(200);
		produto.setAtivo(true);
		//Obtendo valor dos atributos do objeto com getters e is
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

