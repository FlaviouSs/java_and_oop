package membros_estaticos_fixacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("What is the dolar price ? ");
		CurrencyConverter.dolar_price = scan.nextDouble();
		System.out.printf("How many dollar will be bought? ");
		double aux = scan.nextDouble();
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.converter_reais_dolar(aux));
		
		scan.close();
	}

}
