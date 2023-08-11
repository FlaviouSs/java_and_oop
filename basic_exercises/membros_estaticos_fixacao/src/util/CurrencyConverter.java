package util;

public class CurrencyConverter {

	public static double dolar_price = 0.0;
	
	public static double converter_reais_dolar(double amount) {
		return (dolar_price * amount) + ((dolar_price * amount) * 0.06);
	}
	
}
