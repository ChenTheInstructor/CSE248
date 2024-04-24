package p1_is_a;

public class Main {

	public static void main(String[] args) {
		EnhancedTemperatureConverter converter = new EnhancedTemperatureConverter();
		double fahrenheit = 98.6;
		double celsius = converter.fahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
		
		celsius = 37;
		fahrenheit = converter.celsiusToFahrenheit(celsius);
		System.out.println(fahrenheit);
		
	}

}
