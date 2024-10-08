public class MainApp {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setModelo("Ranger");
		Carro c2 = new Carro("Fusion");
		Carro c3 = new Carro("Opala");
		//Instanciando p1 e associando c1 e c2 a ele.
		Proprietario p1 = new Proprietario("Fulano");
		p1.addCarro(c1);
		p1.addCarro(c2);
		//Instanciando p2 e associando c3.
		Proprietario p2 = new Proprietario("Beltrano");
		p2.addCarro(c3);
		//Instanciando p3 sem associar Carro.
		Proprietario p3 = new Proprietario("Sicrano");
		//Apresentando Proprietarios com a lista de Carros
		System.out.println("Dados dos proprietários:");
		System.out.println("Proprietario p1: \n" + p1 + "\n");
		System.out.println("Proprietario p2: \n" + p2 + "\n");
		System.out.println("Proprietario p3: \n" + p3 + "\n");
		//Apresentando somente o modelo dos carros de p1
		System.out.println("Carros de p1: " + p1.getListaDeCarros().size());
		for (Carro carro : p1.getListaDeCarros()) {
			System.out.println("Modelo: " + carro.getModelo());
		}
		//Conhecendo o Proprietario do carro c3
		System.out.println("\nProprietario do carro c3");
		System.out.println("Proprietario: " + c3.getProprietario().getNome());
	}
}
