package exercicios.estruturasDeControle;

import java.util.Scanner;

public class DesafioDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana: ");
		
		String dia = entrada.next();
		String domingo = "domingo";
		//System.out.println(dia);
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");;
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3");;
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Invalido");
		}
		System.out.println("FIM!");
		entrada.close();
	}
}
