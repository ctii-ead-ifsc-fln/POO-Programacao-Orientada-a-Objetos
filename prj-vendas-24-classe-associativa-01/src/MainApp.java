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
		p1.getEstoque().setQtdMinima(10);
		p1.getEstoque().setQtdMaxima(1000);
		p1.getEstoque().repor(200);
		//Instanciação de objeto Produto e Estoque (pela composição), com associação a categoria c1
		Produto p2 = new Produto(2, "Bermuda", "Cargo", 
				BigDecimal.valueOf(350.0), c1);
		p2.getEstoque().setQtdMinima(5);
		p2.getEstoque().setQtdMaxima(100);
		p2.getEstoque().repor(50);
		//Instanciação do objeto Fornecedor
		Fornecedor fornecedor = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		//Associação dos produtos p1 e p2 ao fornecedor pela adição dos produtos a lista de produtos do fornecedor
		fornecedor.add(p1);
		fornecedor.add(p2);
        //Instanciação do objeto cliente
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());

		//criando uma venda com itens de venda
		Venda venda = new Venda();
		venda.setId(1);
		venda.setStatusVenda(EStatusVenda.ABERTA);
		venda.setData(LocalDate.now());
		//associando o objeto cliente a venda
		venda.setCliente(cliente);
		//adicionando itens de venda a venda - classe associativa
		venda.add(1, 1, p1); //cada item de venda adicionado leva um produto, neste caso p1
		venda.add(2, 1, new BigDecimal(300.00), p2);//leva p2 para os itens da venda
		venda.setPago(true);
		venda.setStatusVenda(EStatusVenda.FINALIZADA);
		
		//impressão do cupom
		print(venda);//o objeto venda possui vinculos para os outros objetos de forma direta ou indireta - veja no método print como são acessados
		
	}
	
	public static void print(Venda venda) {
		StringBuilder sb = new StringBuilder();
        String formatText = "%-15s";//String com mínimo de 15 caracteres. O sinal de menos é  alinhamento a esquerda
        String formatValor = "%5.2f";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        //obtendo dados direto da venda
        sb.append("       ***** CUPOM FISCAL ******        ").append("\n");
        sb.append("Empresa........: ").append(venda.getEmpresa()).append("\n");
        sb.append("========================================").append("\n");
        sb.append("Número.........: ").append(venda.getId()).append("\n");
        sb.append("Data...........: ").append(venda.getData().format(formatterData)).append("\n");
        sb.append("     Horario...: ").append(LocalTime.now().format(formatterTime)).append("\n");
        sb.append("==========[ ITENS DO CUPOM ]============").append("\n");
        sb.append("Item\tDescricao\tqtd\tValor").append("\n");
        int i = 0;
        //neste laço são obtidos os dados de item de venda, e de cada item de venda são extraídos dados do produto
        for (ItemDeVenda item: venda.getItensDeVenda()) {
            sb.append(++i).append("\t").append(
                    String.format(formatText, (item.getProduto().getNome().length()>15)?item.getProduto().getNome().substring(0, 14):item.getProduto().getNome())).append("\t")
                    .append(item.getQuantidade()).append("\t")
                    .append(String.format(formatValor, item.getValor()))
                    .append("\n");
        }
        sb.append("----------------------------------------").append("\n");
        sb.append("TOTAL\t\t\t\t").append(String.format(formatValor, venda.getTotal())).append("\n");
        sb.append("========================================").append("\n");
        //obtendo dados do cliente vinculado a venda
        sb.append("Cliente.......: ").append(venda.getCliente().getCpf()).append(", ").append(venda.getCliente().getNome()).append("\n\n");
        sb.append(" ****** OBRIGADO PELA PREFERÊNCIA ***** ").append("\n");
        System.out.println(sb.toString());		
	}
}
