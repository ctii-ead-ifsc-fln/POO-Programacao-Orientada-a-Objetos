import java.math.BigDecimal;

public class MainApp  {
	public static void main(String[] args) {
		
		Nacional fNacional = new Nacional(2, "Empresa B", "contato@empresab.com", "987654321", "11.222.333/0001-99");
		print(fNacional);
		
		Internacional fInternacional = new Internacional(3, "Empresa C", "contato@empresac.com", "987654321", "Espanha", "12345678-9");
		print(fInternacional);
	}
	//imprime os detalhes do supertipo Fornecedor	
	public static void print(Fornecedor f) {
		System.out.println("Dados do fornecedor");
		System.out.println("Nome..........: " + f.getNome());
		System.out.println("E-mail........: " + f.getEmail());
		System.out.println("Fone..........: " + f.getFone());
		System.out.println();
	}
	//Sobrecarga do método print, 
    //imprime os detalhes do subtipo Nacional
	public static void print(Nacional fn) {
		System.out.println("Dados do fornecedor Nacional");
		System.out.println("Dados herdados - genéricos");
		System.out.println("Nome..........: " + fn.getNome());
		System.out.println("E-mail........: " + fn.getEmail());
		System.out.println("Fone..........: " + fn.getFone());
		System.out.println("Dados específicos - especializados");
		System.out.println("Cnpj..........: " + fn.getCnpj());
		System.out.println();
	}
	//Sobrecarga do método print, 
    //imprime os detalhes do subtipo Internacional
	public static void print(Internacional fi) {
		System.out.println("Dados do fornecedor Internacional");
		System.out.println("Dados herdados - genéricos");
		System.out.println("Nome..........: " + fi.getNome());
		System.out.println("E-mail........: " + fi.getEmail());
		System.out.println("Fone..........: " + fi.getFone());
		System.out.println("Dados específicos - especializados");
		System.out.println("País..........: " + fi.getPais());
		System.out.println("Nif...........: " + fi.getNif());
		System.out.println();
	}

}
