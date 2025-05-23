import java.math.BigDecimal;

public class MainApp {
	public static void main(String[] args) {
		Categoria c1 = new Categoria(1, "Eletrodomésticos");
		Categoria c2 = new Categoria(2, "Eletrônicos");
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Soundbar");
		p1.setDescricao("Soundbar 120W");
		p1.setPreco(BigDecimal.valueOf(1300.0));
		//Associação do produto p1 com categoria c2 por meio do método setCategoria
		p1.setCategoria(c2);
		//instanciação dos produtos p2 e p3 com associação da categoria c1
		Produto p2 = new Produto(
				2, "Geladeira", "Geladeira Frost Free", 
				BigDecimal.valueOf(3500.0), c1);
		Produto p3 = new Produto(
				3, "Microondas", "Microondas 34L", 
				BigDecimal.valueOf(710.0), c1);
		//instanciação dos produtos p4 com associação da categoria c2
		Produto p4 = new Produto(
				4, "TV", "TV 42\" tela infinita", 
				BigDecimal.valueOf(1600.0), c2);
		
		//Apresentando os dados dos objetos do tipo Produto
		System.out.println("p1 ==> " + p1);
		System.out.println("p2 ==> " + p2);
		System.out.println("p3 ==> " + p3);
		System.out.println("p4 ==> " + p4);
		
		//Apresentando a descricao da categoria do produto p4
		System.out.println("Categoria de p4 ==> " + 
				p4.getCategoria().getDescricao());
	}
}
