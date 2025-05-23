public class MainApp {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		Triangulo triangulo = new Triangulo(3, 4);
		Quadrado quadrado = new Quadrado(2);
		
		circulo.desenhar();
		triangulo.desenhar();
		quadrado.desenhar();
		
		System.out.println(
				"Área do círculo: " + circulo.calcularArea());
		System.out.println(
				"Área do triângulo: " + triangulo.calcularArea());
		System.out.println(
				"Área do quadrado: " + quadrado.calcularArea());
	}
}



