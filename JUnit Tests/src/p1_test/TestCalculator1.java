package p1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import p1.Calculator;

public class TestCalculator1 {
	static Calculator c;

	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@AfterAll
	public static void display() {
		System.out.println("The tests are done.");
	}

	@Test
	public void testAdd() {
		assertEquals(10.0, c.add(4.0, 6.0));
	}

	@Test
	public void testSubtract() {
		assertEquals(-2.0, c.subtract(4.0, 6.0));
	}

	@Test
	public void testMultiply() {
		assertEquals(24.0, c.multiply(4.0, 6.0));
	}

	@Test
	public void testDivide() {
		assertEquals(0.6666667, c.divide(4.0, 6.0), 0.00001);
	}

}
