package classe;

public class DataTeste {

	public static void main(String[] args) {
		

		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.dia = 5;
		d1.mes = 7;
		d1.ano = 2023;
		
		d2.dia = 29;
		d2.mes = 2;
		d2.ano = 2023;
				
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		

			
			
			

	}

}
