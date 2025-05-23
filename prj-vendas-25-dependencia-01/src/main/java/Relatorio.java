
public class Relatorio {
	public static void imprimirReduzido(IResumoDados objeto) {
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
	
	public static void imprimir(IResumoDados objeto) {
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
