import java.time.LocalDate;

public class MainApp  {
	public static void main(String[] args) {
		IResumoDados objeto;
		//upcasting - objeto Cliente para IResumoDados
		objeto = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
		//upcasting - objeto Nacional para IResumoDados
		objeto = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		//upcasting - objeto Internacional para IResumoDados
		objeto = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
		
		//Operador instanceof para evitar uma exceção com casting
		if (objeto instanceof Cliente) {
			Cliente cliente = (Cliente) objeto; 
			print(cliente);
		} if (objeto instanceof Nacional) {
			Nacional nacional = (Nacional) objeto; 
			print(nacional);
		} else {
			Internacional internacional = (Internacional) objeto; 
			print(internacional);
		}
	}
	//Imprime dados de objetos diferentes
	//  pelo método getDados por meio do polimorfismo	
	public static void print(IResumoDados objeto) {
		if (objeto instanceof Cliente) {
			System.out.println("Dados do Cliente");
		} else if (objeto instanceof Nacional) {
			System.out.println("Dados do Fornecedor Nacional");
		} else {
			System.out.println("Dados do Fornecedor Internacional");
		}
		System.out.println(objeto.getDados());
		System.out.println();
	}
}
