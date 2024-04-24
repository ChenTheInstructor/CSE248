package p3_decorator_pattern;

public class TemperatureConverter implements TemperatureConverterInterface{
	
	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}
}
