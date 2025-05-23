import java.time.LocalDate;

public class MainApp  {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
        print(cliente);
        //Declaração da variável fornecedor do tipo Fornecedor
        Fornecedor fornecedor = null;
        //Operação de upcasting - subclasse para superclasse
        //Uma instância da subclasse é atribuída a uma variável do tipo superclasse
		fornecedor = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		
		//operação natural de upcasting - subclasse para superclasse
		fornecedor = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
		
		//Operador instanceof para evitar uma exceção com casting
		if (fornecedor instanceof Nacional) {
			Nacional nacional = (Nacional) fornecedor; 
			print(nacional);
		} else {
			Internacional internacional = (Internacional) fornecedor; 
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
