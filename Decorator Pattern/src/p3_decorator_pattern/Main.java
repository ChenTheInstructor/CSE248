package p3_decorator_pattern;

public class Main {

	public static void main(String[] args) {
		TemperatureConverterInterface temperatureConverter = new TemperatureConverter();
		EnhancedTemperatureConverter converter = new EnhancedTemperatureConverter(temperatureConverter);
		double fahrenheit = 98.6;
		double celsius = converter.fahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
		
		celsius = 37;
		fahrenheit = converter.celsiusToFahrenheit(celsius);
		System.out.println(fahrenheit);
		
	}

}
