public class Triangulo {
	public float base;
	public float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	public void desenhar() {
        System.out.println("Desenhando um triângulo");
    }
	public double calcularArea() {
        return (base * altura) / 2;
    }
}

