package p3_average_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p3.AverageCalculator;

public class AverageTest {
	@Test
	@DisplayName("Average Test")
	void testGetAverage() {
		AverageCalculator calc = new AverageCalculator();
		assertEquals(5.0, calc.getAverage(4.0, 6.0), 0.0001);
	}
}
