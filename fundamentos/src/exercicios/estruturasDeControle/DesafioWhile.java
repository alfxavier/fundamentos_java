package exercicios.estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		//digitar uma nota de 0 a 10. 
		//Quando o usuario digitar a nota essa deve ser armazenda numa variável chamada total. 
		//O total soma todas as notas que foram digitadas.
		//
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0; 
		
		while (nota != -1) {
			System.out.println("Digite euma nota: ");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
			}
		}
		System.out.println("Total da média das nostas é " + (total/quantidadeDeNotas));
		
		
		entrada.close();

	}

}
