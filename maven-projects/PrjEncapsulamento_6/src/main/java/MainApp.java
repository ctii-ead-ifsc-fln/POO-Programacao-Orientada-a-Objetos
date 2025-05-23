public class MainApp {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setNome("Notebook");
		produto.setPreco(3500.0);
		//produto.setQuantidade(-100);//método indisponível
		produto.setLimiteMaximo(200);
		produto.setAtivo(true);
		
		System.out.println("Quantidade inicial: " 
				+ produto.getQuantidade());
		//movimentos de reposição de produtos
		produto.repor(100);//entrada aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
		produto.repor(200);//entrada não aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
		produto.repor(-100);//entrada não aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
		
		System.out.println("\nQuantidade atual: " 
				+ produto.getQuantidade());
		//movimentos retirada de produto
		produto.retirar(10);//entrada aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
		produto.retirar(210);//entrada não aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
		produto.retirar(-10);//entrada não aceita
		System.out.println("Qtde.: " + produto.getQuantidade());
	}
}

