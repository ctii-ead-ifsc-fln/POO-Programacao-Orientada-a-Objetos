package mainapp;

import java.util.Scanner;

import domain.Imc;

public class MainApp {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// instanciação de um objeto IMC
		Imc imc = new Imc();
		// entrada de dados
		System.out.print("Nome.....: ");
		imc.setNome(entrada.nextLine());
		System.out.print("Peso.....: ");
		imc.setPeso(entrada.nextFloat());
		System.out.print("Altura...: ");
		imc.setAltura(entrada.nextFloat());

		System.out.println("**** Resultado ****");
		System.out.println(imc.getDados());
	}

}
