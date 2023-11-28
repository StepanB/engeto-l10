package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {


	@Test
	@DisplayName("Test souctu dvou cisel.")
	public void testScitani() {
		int actual = Calc.scitani(2, 3);
		int expected = 5;

		Assertions.assertEquals(actual, expected);
	}

	@Test
	@DisplayName("Test souctu dvou cisel co se nerovnaji nule.")
	public void testScitaniBiggerThenZero() {
		int actual = Calc.scitani(2, 3);
		int expected = 0;

		Assertions.assertTrue(actual > expected);
	}

	@Test
	public void testDeleniNulou() {

		Exception expected = Assertions.assertThrows(ArithmeticException.class, () ->
				Calc.deleni(12, 0));

		Assertions.assertEquals("/ by zero", expected.getMessage());
	}

	@Test
	void nasobeni() {
		int actual = Calc.nasobeni(2, 3);
		int expected = 6;

		Assertions.assertEquals(actual, expected);
	}
}
