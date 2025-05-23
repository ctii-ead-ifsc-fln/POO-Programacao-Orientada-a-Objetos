import java.math.BigDecimal;

public class MainApp {
	public static void main(String[] args) {
		Categoria c1 = new Categoria(1, "Eletrodomésticos");
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Soundbar");
		p1.setDescricao("Soundbar 120W");
		p1.setPreco(BigDecimal.valueOf(1300.0));
		
		//Apresentando a descricao da categoria do produto p1
		System.out.println("Categoria de p1 ==> " + 
				p1.getCategoria().getDescricao());
	}
}
