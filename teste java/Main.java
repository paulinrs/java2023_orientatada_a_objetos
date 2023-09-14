import java.util.Locale;

public class Main {

	public static void main(String[] args) {
				
	System.out.print("Meu primeiro código Java -> "); // Sem quebra de linha ao final:
	System.out.println("Bom dia!"); //Com quebra de linha ao final:
	
	int numerico = 32;
	double pontoFlutuante = 10.567;
	System.out.println( numerico);
	System.out.println(pontoFlutuante);
	System.out.printf("%.2f%n", pontoFlutuante); //com duas casas decimais:
	System.out.printf("%.4f%n", pontoFlutuante); //Com quatro casas decimais:
	Locale.setDefault(Locale.US); //Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, use o Locale
	System.out.printf("%.4f%n", pontoFlutuante);
	System.out.println("RESULTADO = " + numerico + " METROS");
	System.out.printf("RESULTADO = %.2f metros%n", pontoFlutuante ); //Para concatenar com casas decimais
	
	String nome = "Maria";
	int idade = 31;
	double renda = 4000.0;
	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
	// (%f = ponto flutuante) (%d = inteiro) (%s = texto) (%n = quebra de linha)
	
	//exercício de fixação
	
	String product1 = "Computer";
	String product2 = "Office desk";
	byte age = 30;
	int code = 5290;
	char gender = 'F';
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	System.out.println("Products:");
	System.out.printf("%s, which price is $ %.2f%n", product1, price1);
	System.out.printf("%s, which price is $ %.2f%n", product2, price2);
	System.out.println();
	System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
	System.out.println();
	System.out.printf("Measue with eight decimal places: %.8f%n", measure);
	System.out.printf("Rouded (three decimal places): %.3f%n", measure);
	System.out.println();
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f%n", measure);

		}

}