import java.math.BigDecimal;

public class MainApp {
	public static void main(String[] args) {
		Categoria c1 = new Categoria(1, "Vestuário");
		Produto p1 = new Produto(1, "Camisa", "Polo", 
				BigDecimal.valueOf(130.0), c1);
		Produto p2 = new Produto(2, "Bermuda", "Cargo",
				BigDecimal.valueOf(350.0), c1);
		/*
		 * A COMPOSIÇÃO é evidenciada pelo fato de não precisar
		 * instanciar um objeto Estoque e associar ao objeto produto.
		 * Note que a linha Estoque e = new Estoque() não se faz necessário.
		 * Tão pouco p1.setEstoque(e) 
		 */
		//impressão dos dados do produto com estoque atual
		print(p1);
		
		//definindo minimo e maximo para o estoque de p1
		p1.getEstoque().setQtdMinima(10);
		p1.getEstoque().setQtdMaxima(1000);
		
		//movimentação do estoque do produto p1
		p1.getEstoque().repor(200);
		//exibindo os dados do produto com estoque atualizado
		print(p1);
		
		//movimentação do estoque do produto p1
		//exibindo os dados do produto com estoque atualizado
		print(p1);
				
		//AGREGAÇÃO: objetos Produtos são adicionados ao Fornecedor
		Fornecedor f1 = new Fornecedor(1, "Veste Mais", "contato@vestemais.com", "47987788778");
		f1.add(p1);
		f1.add(p2);

		//Exibindo os detalhes do fornecedor pelo método print
		print(f1);
	}
	
	public static void print(Fornecedor f) {
		System.out.println("Dados do fornecedor");
		System.out.println("Nome..........: " + f.getNome());
		System.out.println("E-mail........: " + f.getEmail());
		System.out.println("Fone..........: " + f.getFone());
		System.out.println("Produtos fornecidos:");
		//imprimindo cada produto lista
		System.out.println(" Nome | Descrição | Preço | Categoria | Estoque ");
		for(Produto p : f.getProdutos()) {
			System.out.println(" - " + p.getNome() + ", " + p.getDescricao() + 
					", " + p.getPreco() + ", " + p.getCategoria().getDescricao() +
					", " + p.getEstoque().getQuantidade());
		}
		System.out.println();
	}
	
	public static void print(Produto p) {
		System.out.println("Dados do Produto:");
		System.out.println("Nome..........: " + p.getNome());
		System.out.println("Descrição.....: " + p.getDescricao());
		System.out.println("Preço.........: " + p.getPreco());
		System.out.println("*** E s t o q u e   d o   P r o d u t o ***");
		System.out.println("Quantidade....: " + p.getEstoque().getQuantidade());
		System.out.println("Mínimo........: " + p.getEstoque().getQtdMinima());
		System.out.println("Mínimo........: " + p.getEstoque().getQtdMaxima());
		System.out.println();
	}
}
