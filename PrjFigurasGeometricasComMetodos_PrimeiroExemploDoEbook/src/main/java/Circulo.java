public class Circulo {
	public float raio;

	public Circulo(float raio) {
		this.raio = raio;
	}
	public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
	public double calcularArea() {
        return Math.PI * raio * raio;
    }
}


