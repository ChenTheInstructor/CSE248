package p3_decorator_pattern;

public class EnhancedTemperatureConverter implements EnhancedTemperatureConverterInterface {
	private TemperatureConverterInterface temperatureConverter;
	
	public EnhancedTemperatureConverter(TemperatureConverterInterface temperatureConverter) {
		this.temperatureConverter = temperatureConverter;
	}
	
	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		return temperatureConverter.fahrenheitToCelsius(fahrenheit);
	}
	
	@Override
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}
}
