import java.time.LocalDate;

public class MainApp  {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
        print(cliente);
        //Declaração da variável fornecedor do tipo Fornecedor
        Fornecedor fornecedor = null;
        //instanciação do objeto Nacional e atribuição ao fornecedor
		fornecedor = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		print(fornecedor);
		//instanciação do objeto Internacional e atribuição ao fornecedor
		fornecedor = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
		print(fornecedor);
	}
	//imprime os detalhes do supertipo Fornecedor	
	public static void print(Fornecedor f) {
		System.out.println("Dados do fornecedor");
		System.out.println(f.getDados());
		System.out.println();
	}
	//Sobrecarga do método print, 
    //imprime os detalhes do cliente		
	public static void print(Cliente c) {
		System.out.println("Dados do cliente");
		System.out.println(c.getDados());
		System.out.println();
	}
}