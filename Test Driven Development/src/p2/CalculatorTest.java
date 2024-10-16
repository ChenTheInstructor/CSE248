package p2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	@ParameterizedTest
	@CsvSource({"-1, -2, -3",
				"2, 5, 7",
				"-1, 1, 0,"
		})
	
	
	void testSum(int n1, int n2, int expected) {
		Calculator calc = new Calculator();
		assertEquals(expected, calc.sum(n1, n2));
	}
}
