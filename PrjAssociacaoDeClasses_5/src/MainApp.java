import java.math.BigDecimal;

public class MainApp {
	public static void main(String[] args) {
		Categoria c1 = new Categoria(1, "Eletrodomésticos");
		Categoria c2 = new Categoria(2, "Eletrônicos");
		Produto p1 = new Produto(1, "Soundbar", "Soundbar 120W", 
				BigDecimal.valueOf(1300.0), c2);
		//instanciação dos produtos p2 e p3 com associação da categoria c1
		Produto p2 = new Produto(2, "Geladeira", "Geladeira Frost Free", 
				BigDecimal.valueOf(3500.0), c1);
		Produto p3 = new Produto(3, "Microondas", "Microondas 34L", 
				BigDecimal.valueOf(710.0), c1);
		//instanciação dos produtos p4 com associação da categoria c2
		Produto p4 = new Produto(4, "TV", "TV 42\" tela infinita", 
				BigDecimal.valueOf(1600.0), c2);		
		
		//instanciação de fornecedor f1 
		Fornecedor f1 = new Fornecedor(1, "BRA Express", "contato@braexpress.com", "5548912345678");
		//adicionando p2 e p3 a lista de produtos do fornecedor f1
		f1.add(p2);
		f1.add(p3);
		//instanciação de fornecedor f2 
		Fornecedor f2 = new Fornecedor(1, "Eletro++", "contato@eletroplusplus.com", "8633998776543");
		//adicionando p1 e p4 a lista de produtos do fornecedor f2
		f2.add(p1);
		f2.add(p4);

		//Exibindo os detalhes do fornecedor pelo método print
		print(f1);
		print(f2);
		//Exibindo o fornecedor do produto p1
		System.out.println("\nFornecedor de p1 " + p1.getNome() + ": " + p1.getFornecedor().getNome());
		//Exibindo a categoria de um produto por meio da variável f1
		System.out.println("\nCategoria do produto de f1: " + f1.getProdutos().get(0).getCategoria().getDescricao());
		//Removendo o produto de uma lista de produtos de fornecedor
		f1.remove(p2);
		print(f1);
		//Exibindo o fornecedor de p2
		if (p2.getFornecedor() != null) {
			System.out.println("Fornecedor de p2: " + p2.getNome() + ": " + p2.getFornecedor().getNome());
		} else {
			System.out.println("Produto " + p2.getNome() + " sem fornecedor!");
		}
	}
	
	public static void print(Fornecedor f) {
		System.out.println("Dados do fornecedor");
		System.out.println("Nome..........: " + f.getNome());
		System.out.println("E-mail........: " + f.getEmail());
		System.out.println("Fone..........: " + f.getFone());
		System.out.println("Produtos fornecidos:");
		//imprimindo cada produto lista 
		for(Produto p : f.getProdutos()) {
			System.out.println(" - " + p.getNome() + ", " + p.getDescricao() + 
					", " + p.getPreco() + ", " + p.getCategoria().getDescricao());
		}
		System.out.println();
	}
}
