package p1_is_a;

public class EnhancedTemperatureConverter extends TemperatureConverter {

	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}
}
