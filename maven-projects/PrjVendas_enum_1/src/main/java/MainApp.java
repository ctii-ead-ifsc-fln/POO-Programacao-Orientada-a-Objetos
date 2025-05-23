import java.math.BigDecimal;

public class MainApp {
	public static void main(String[] args) {
		Categoria c1 = new Categoria(1, "Vestuário");
		Produto p1 = new Produto(1, "Camisa", "Polo", 
				BigDecimal.valueOf(130.0), c1);
		
		print(p1);
		
		p1.getEstoque().setQtdMinima(10);
		p1.getEstoque().setQtdMaxima(1000);
		
		//Tentativa de reposição sem efeito:
		//A situação do estoque é iniciada com BLOQUEADO
		p1.getEstoque().repor(200);
		//exibindo os dados do produto
		print(p1);
		
		//Atualizando a situação do estouqe do produto para ATIVO
		p1.getEstoque().setSituacao(ESituacao.ATIVO);
		//movimentação do estoque do produto p1
		p1.getEstoque().repor(200);
		//exibindo os dados do produto com estoque atualizado
		print(p1);
	}
		
	public static void print(Produto p) {
		System.out.println("Dados do Produto:");
		System.out.println("Nome..........: " + p.getNome());
		System.out.println("Descrição.....: " + p.getDescricao());
		System.out.println("Preço.........: " + p.getPreco());
		System.out.println("*** E s t o q u e   d o   P r o d u t o ***");
		System.out.println("Situação......: " + p.getEstoque().getSituacao());
		System.out.println("Quantidade....: " + p.getEstoque().getQuantidade());
		System.out.println("Mínimo........: " + p.getEstoque().getQtdMinima());
		System.out.println("Mínimo........: " + p.getEstoque().getQtdMaxima());
		System.out.println();
	}
}
