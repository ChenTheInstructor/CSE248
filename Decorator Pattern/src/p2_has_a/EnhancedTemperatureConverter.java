package p2_has_a;

public class EnhancedTemperatureConverter {
	private TemperatureConverter temperatureConverter;
	
	public EnhancedTemperatureConverter(TemperatureConverter temperatureConverter) {
		this.temperatureConverter = temperatureConverter;
	}
	
	public double fahrenheitToCelsius(double fahrenheit) {
		return temperatureConverter.fahrenheitToCelsius(fahrenheit);
	}
	
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}
}
