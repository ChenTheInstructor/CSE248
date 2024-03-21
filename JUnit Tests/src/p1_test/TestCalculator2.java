package p1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p1.Calculator;

public class TestCalculator2 {

	@Test
	@DisplayName("Test the subtract method.")
	public void testSubtract() {
		Calculator c = new Calculator();
		assertEquals(5.0, c.subtract(7.0, 2.0), 0.0000001);
	}
}
