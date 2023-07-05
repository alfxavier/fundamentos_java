package exercicios.estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precis digitar a palavra mágica...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
		

	}

}
