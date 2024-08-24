
public class MainApp {
	public static void main(String[] args) {
		Produto produto = new Produto();
		//definindo valores aos atributos do objeto
		produto.nome = "Celular";
		produto.preco = 1500.0;
		produto.quantidade = -100;
		produto.limiteMaximo = 200;
		
		//Apresentando os dados do produto
		System.out.println(
			"Nome..........: " + produto.nome + "\n" +  
			"Preço.........: " + produto.preco + "\n" +
			"Quantidade....: " + produto.quantidade + "\n" +
			"Limite........: " + produto.limiteMaximo);
	}
}
