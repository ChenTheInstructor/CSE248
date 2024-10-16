package p1_calculator_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import p1_calculator.Calculator;

public class CalculatorTest {
	static private Calculator calc;
	
	@AfterAll
	static void tearDown() {
		System.out.println("All tests are done!");
	}
	
	@BeforeAll
	static void setup() {
		calc = new Calculator();
	}

//	@Test
//	@Disabled
	@DisplayName("Add with 3 sets of data")
	@ParameterizedTest
	@CsvSource({"1.1, 1.1, 2.2", 
				"2.1, 1.1, 3.2",
				"5.0, 5.0, 10.0"})
	
	void testAdd(double n1, double n2, double expected) {
		assertEquals(expected, calc.add(n1, n2), 0.00000001);
	}
	
	@Test
	@DisplayName("Subtract")
	void testSubtract() {
		assertEquals(-1.1, calc.subtract(1.1, 2.2), 0.00000001);
	}
	
	@Test
	@DisplayName("Multiply")
	void testMultiply() {
		assertEquals(2.42, calc.multiply(1.1, 2.2), 0.00000001);
	}
	
	@Test
	@DisplayName("Divide")
	void testDivide() {
		assertEquals(0.5, calc.divide(1.1, 2.2), 0.00000001);
	}
}
