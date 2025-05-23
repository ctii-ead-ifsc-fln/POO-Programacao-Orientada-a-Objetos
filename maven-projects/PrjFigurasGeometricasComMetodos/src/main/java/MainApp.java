public class MainApp {
	public static void main(String[] args) {
		System.out.println("Figuras Geométricas");
		
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();
		//atribuindo valores aos atributos
		circulo.raio = 3.5F;
		triangulo.base = 4;
		triangulo.altura = 6;
		quadrado.lado = 3;
		//executando os métodos desenhar e calcualrArea dos objetos
		circulo.desenhar();
		System.out.println("Área do círculo: " + circulo.calcularArea());
		triangulo.desenhar();
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
		quadrado.desenhar();
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
	}
}



