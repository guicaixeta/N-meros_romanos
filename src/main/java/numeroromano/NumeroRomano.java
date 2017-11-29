package numeroromano;

import java.util.Arrays;

public class NumeroRomano {
	public static int converterNumeroRomano(String numeroRomano) throws IllegalArgumentException {
		switch(numeroRomano) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		case "M":
			return 1000;
		default:
			throw new IllegalArgumentException("Número romano invalido: "+ numeroRomano);
		}
	}
	
	public static int converterStringRomano(String stringRomana) throws IllegalArgumentException {
		int result = stringRomana
				.chars()
				.reduce(0, (a, b) -> {
					return a + NumeroRomano.converterNumeroRomano(String.valueOf((char) b));
				});
		
		if(1 >= result || result <= 4999) {
			return result;
		} else {
			throw new IllegalArgumentException("String invalida");
		} 	
	}
}
