package numeroromano;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroRomanoTest {

	@Test
	public void testM() {
		assert(NumeroRomano.converterNumeroRomano("M") == 1000);
	}
	
	@Test
	public void testI() {
		assert(NumeroRomano.converterNumeroRomano("I") == 1);
	}

	@Test
	public void testV() {
		assert(NumeroRomano.converterNumeroRomano("V") == 5);
	}
	
	@Test
	public void testX() {
		assert(NumeroRomano.converterNumeroRomano("X") == 10);
	}
	
	@Test
	public void testL() {
		assert(NumeroRomano.converterNumeroRomano("L") == 50);
	}
	
	@Test
	public void testC() {
		assert(NumeroRomano.converterNumeroRomano("C") == 100);
	}
	
	@Test
	public void testD() {
		assert(NumeroRomano.converterNumeroRomano("D") == 500);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNumeroRomanoInvalido() {
		NumeroRomano.converterNumeroRomano("NumeroRomanoInvalido");
	}
	
	@Test
	public void testStringNumerica() {
		assert(NumeroRomano.converterStringRomano("MMMMCCCCLLXXXXXV") == 4555);
	}
	
	@Test
	public void testStringNumerica2() {
		assert(NumeroRomano.converterStringRomano("MDCLXVI") == 1666);
	}
	
}
