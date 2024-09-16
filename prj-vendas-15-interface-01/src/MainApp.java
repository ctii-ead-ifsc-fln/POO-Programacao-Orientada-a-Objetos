import java.time.LocalDate;

public class MainApp  {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Fulano", "123.321.456-99", "48-999887766", "Rua Tal", LocalDate.now());
        print(cliente);
        
		Nacional fNacional = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		print(fNacional);
		
		Internacional fInternacional = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
		print(fInternacional);
	}
	//imprime os detalhes do supertipo Fornecedor	
	public static void print(Fornecedor f) {
		System.out.println("Dados do fornecedor");
		System.out.println(f.getDados());
		System.out.println();
	}
	//Sobrecarga do método print, 
    //imprime os detalhes do subtipo Nacional
	public static void print(Nacional fn) {
		System.out.println("Dados do fornecedor Nacional");
		System.out.println(fn.getDados());
		System.out.println();
	}
	//Sobrecarga do método print, 
    //imprime os detalhes do subtipo Internacional
	public static void print(Internacional fi) {
		System.out.println("Dados do fornecedor Internacional");
		System.out.println(fi.getDados());
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
