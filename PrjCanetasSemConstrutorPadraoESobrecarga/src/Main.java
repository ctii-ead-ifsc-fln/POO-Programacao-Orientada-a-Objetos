
public class Main {
	public static void main(String[] args) {
		//Iniciando canetas com uma cor.
        Caneta caneta1 = new Caneta("Azul");
        //Iniciando canetas com demais dados mas mantendo
        //mas mantendo a obrigatoriedade da cor
        Caneta caneta2 = new Caneta("Vermelha", 0.5F, true);
        Caneta caneta3 = new Caneta("Preta", 0.7F, false);
        
        System.out.println("\nDados da Caneta 1");
        System.out.println("Cor.....: " + caneta1.cor);
        System.out.println("Ponta...: " + caneta1.ponta);
        System.out.println("Tampada.? " + caneta1.tampada);
        
        //difinindo os demais dados da caneta1
        caneta1.ponta = 1.0F;
        caneta1.tampada = true;
        System.out.println("\nDados da Caneta 1 com outros dados");
        System.out.println("Cor.....: " + caneta1.cor);
        System.out.println("Ponta...: " + caneta1.ponta);
        System.out.println("Tampada.? " + caneta1.tampada);
        

        System.out.println("\nDados da Caneta 2");
        System.out.println("Cor.....: " + caneta2.cor);
        System.out.println("Ponta...: " + caneta2.ponta);
        System.out.println("Tampada.? " + caneta2.tampada);

        System.out.println("\nDados da Caneta 3");
        System.out.println("Cor.....: " + caneta3.cor);
        System.out.println("Ponta...: " + caneta3.ponta);
        System.out.println("Tampada.? " + caneta3.tampada);
    }
}
