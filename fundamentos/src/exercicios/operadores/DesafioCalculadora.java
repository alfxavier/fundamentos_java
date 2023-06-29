package exercicios.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número da operação: ");
		String num1 = entrada.nextLine();
		System.out.println("Digite o segundo número da operação: ");
		String num2 = entrada.nextLine();
		System.out.println("Digite o operador da sentença: ");
		String operador = entrada.nextLine();
		//System.out.println(operador);
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double resultado = "+".equals(operador.trim()) ? n1+n2 : 
			("-".equals(operador.trim()) ? n1-n2 : 
				("*".equals(operador.trim()) ? n1*n2 : 
					("/".equals(operador.trim()) ? n1/n2 : 0)));
				System.out.println("Resultado: "+resultado);
		
		
		
		entrada.close();
	}

}
