
public class MainApp {
	public static void main(String[] args) {
		/*
		 * Composição: será instanciada a casa1, no entanto, os comodos são instanciados
		 * na classe Casa e não em MainApp, criando essa relação todo-parte, onde os
		 * comodos não podem existir independentemente da casa
		 */
		Casa casa1 = new Casa("Alvenaria");
		casa1.adicionarComodo("Sala");
		casa1.adicionarComodo("Cozinha");
		
		print(casa1);

		Casa casa2 = new Casa("Madeira");
		casa2.adicionarComodo("Sala");
		casa2.adicionarComodo("Cozinha");
		casa2.adicionarComodo("Suite");
		casa2.adicionarComodo("Quarto");
		
		print(casa2);
		
		/* Tente tirar o comentário das linhas 27 e 28 e execute o programa.
		 * Verás que a casa2 (todo) é null, ous seja, ela foi destruída, fazendo com que
		 * os cômodos (partes) também deixem de existir. 
		 */
		//casa2 = null; //destruição da casa
		//print(casa2); 

	}

	/**
	 * Método para exibir os detalhes da casa (tipo + cômodos)
	 * 
	 * @param casa tipo Casa
	 */
	public static void print(Casa casa) {
		System.out.println("Quantidade de cômodos.: " + casa.getComodos().size());
		System.out.println("Tipo..................: " + casa.getTipo());
		if (casa.getComodos().size() > 0) {
			System.out.println("Lista de Cômodos: ");
			for (Comodo comodo : casa.getComodos()) {
				System.out.println(comodo.getNome());
			}
		}
		System.out.println("");
	}

}
