import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainApp  {
	public static void main(String[] args) {
		//define o nome da empresa - membro de classe estático - não há necessidade de instanciar Venda
		Venda.setEmpresa("Lojas++");
		//Instanciação de objeto Categoria
		Categoria c1 = new Categoria(1, "Vestuário");
		//Instanciação de objeto Produto e Estoque (pela composição), com associação a categoria c1
		Produto p1 = new Produto(1, "Camisa", "Polo", 
				BigDecimal.valueOf(130.0), c1);
		p1.getEstoque().setSituacao(ESituacao.ATIVO);
		p1.getEstoque().setQtdMinima(10);
		p1.getEstoque().setQtdMaxima(1000);
		//tratamento de exceção EstoqueException para repor o estoque 
		try { //tratamento de exceção verificada para repor a quantidade no estoque 
			//p1.getEstoque().repor(200);
			p1.getEstoque().repor(1200);//quantidade acima da máxima - há uma exceção
		} catch (EstoqueException ex) {
			System.out.println("Exceção na reposição: " + ex.getMessage());
		}
		//Instanciação de objeto Produto e Estoque (pela composição), com associação a categoria c1
		Produto p2 = new Produto(2, "Bermuda", "Cargo", 
				BigDecimal.valueOf(350.0), c1);
		p2.getEstoque().setSituacao(ESituacao.ATIVO);
		p2.getEstoque().setQtdMinima(5);
		p2.getEstoque().setQtdMaxima(100);
		try {
			p2.getEstoque().repor(50);
		} catch (EstoqueException ex) {
			System.out.println("Exceção na reposição: " + ex.getMessage());
		}
		
		//Instanciação do objeto Fornecedor
		Fornecedor fornecedor = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		//Associação dos produtos p1 e p2 ao fornecedor pela adição dos produtos a lista de produtos do fornecedor
		fornecedor.add(p1);
		fornecedor.add(p2);
		//solicitando a impressão de dados resumido do fornecedor
	    print(fornecedor, true);//true - para dados resumido
        //Instanciação do objeto cliente
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
        //solicitando a impressão de todos os dados do cliente
	    print(cliente, false);//false - para todos os dados

        //Tratamento das exceções VendaException e EstoqueException, 
        //que podem ser lançadas/propagadas em uma operação add.
		try {
			System.out.println("Iniciando o registro de venda.");
			//criando uma venda com itens de venda
			Venda venda = new Venda();
			venda.setId(1);
			venda.setStatusVenda(EStatusVenda.ABERTA);
			//venda.setStatusVenda(EStatusVenda.CANCELADA);
			venda.setData(LocalDate.now());
			//associando o objeto cliente a venda
			venda.setCliente(cliente);
			
			//Exceções podem ocorrer na adição de intens
			//VendaException - se o status for diferente de ABERTA
			//EstoqueException - se situação for diferente de ATIVO ou quantidade insuficiente para retirada
			venda.add(1, 1, p1); 
			//venda.add(2, 1, new BigDecimal(300.00), p2);
			venda.add(2, 55, new BigDecimal(300.00), p2);//tentativa de retirar 55 itens do estoque
			venda.setPago(true);
			venda.setStatusVenda(EStatusVenda.FINALIZADA);
			
			//impressão do cupom
			printCupom(venda);//o objeto venda possui vinculos para os outros objetos de forma direta ou indireta - veja no método print como são acessados

		} catch (EstoqueException ex) {
			System.out.println("Exceção Estoque: " + ex.getMessage());
		} catch (VendaException ex) {
			System.out.println("Exceção Venda: " + ex.getMessage());
		} finally {
			System.out.println("Finalizando o registro de venda.");
		}
		
	}
	
	public static void printCupom(Venda venda) {
		CupomFiscal cf = new CupomFiscal();
        System.out.println(cf.gerarCupom(venda));		
	}
	
	public static void print(IResumoDados objeto, boolean reduzido) {
		if (reduzido) {
		    Relatorio.imprimirReduzido(objeto);
		} else {
			Relatorio.imprimir(objeto);
		}
	}
}
