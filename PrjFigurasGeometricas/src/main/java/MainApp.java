public class MainApp {
	public static void main(String[] args) {
		System.out.println("Figuras Geométricas");
		
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();
		Circulo circulo2 = null;
		//atribuindo valores aos atributos
		circulo.raio = 10;
		triangulo.base = 4;
		triangulo.altura = 6;
		quadrado.lado = 3;
		circulo2.raio = 10;
		//imprimindo os dados dos objetos
		System.out.println("Raio do circulo: " + circulo.raio);
		System.out.println("Triangulo: " +
			triangulo.base + " de base e " +
				triangulo.altura + " de altura.");
		System.out.println("Lado do quadrado: " + quadrado.lado);
	}
}



