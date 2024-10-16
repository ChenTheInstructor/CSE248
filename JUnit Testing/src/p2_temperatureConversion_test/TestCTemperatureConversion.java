package p2_temperatureConversion_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import p2_temperatureConversion.TemperatureConversion;

public class TestCTemperatureConversion {

	@Test
	void testCelsiusToFahrenheit() {
		TemperatureConversion tc = new TemperatureConversion();
		assertThrows(IllegalArgumentException.class, () -> tc.celsiusToFahrenheit(-273.17));
	}
}
