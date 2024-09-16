import java.time.LocalDate;

public class MainApp  {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
        printResumido(cliente);

        Fornecedor fornecedor = null;
        
        fornecedor = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
        printResumido(fornecedor);
		
		fornecedor = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
        printResumido(fornecedor);
	}
	//Imprime dados de objetos diferentes
	//  pelo método getDados por meio do polimorfismo	
	public static void printResumido(IResumoDados objeto) {
		if (objeto instanceof Cliente) {
			System.out.println("Dados do Cliente");
			Cliente cliente = (Cliente) objeto;
			System.out.println("Nome.........: " + cliente.getNome());
			System.out.println("CPF..........: " + cliente.getCpf());
		} else if (objeto instanceof Nacional) {
			System.out.println("Dados do Fornecedor Nacional");
			System.out.println("Nome.........: " + ((Nacional)objeto).getNome());
			System.out.println("CNPJ.........: " + ((Nacional)objeto).getCnpj());
		} else {
			System.out.println("Dados do Fornecedor Internacional");
			System.out.println("Nome.........: " + ((Internacional)objeto).getNome());
			System.out.println("NIF..........: " + ((Internacional)objeto).getNif());
			System.out.println("País.........: " + ((Internacional)objeto).getPais());
		}
		System.out.println();
	}
}
