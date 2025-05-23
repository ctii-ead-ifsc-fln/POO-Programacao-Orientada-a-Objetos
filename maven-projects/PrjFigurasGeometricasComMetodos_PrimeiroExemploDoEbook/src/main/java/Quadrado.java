public class Quadrado {
	public float lado;
	
	public Quadrado(float lado) {
		this.lado = lado;
	}
	public void desenhar() {
        System.out.println("Desenhando um quadrado");
    }
	public double calcularArea() {
        return lado * lado;
    }
}

