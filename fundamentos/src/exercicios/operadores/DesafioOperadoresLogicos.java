package exercicios.operadores;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {

		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		System.out.println("Vai comprar a televisão de 50\": " +(trabalho1 && trabalho2));
		System.out.println("Vai televisão de 32\": " +(trabalho1 ^ trabalho2));
		System.out.println("Vai tomar sorvete: " +((trabalho1 & trabalho2)||(trabalho1 || trabalho2)));
		System.out.println("Vai ficar em casa: " +(!trabalho1 & !trabalho2));
		
	}

}
