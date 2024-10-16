package p2_temperatureConversion;

/**
 * The TemperatureConversion Java application prints a table converting Celsius
 * to Fahrenheit degrees
 * 
 * @see <A HREF="./temperatureConversion/TemperatureConversion.java"> Java
 *      Source Code (www.sunysuffolk.edu/cse248)</A>
 * 
 * @author Chen <A HREF="mailto:chenb@sunysuffolk.edu"> (Ben Chen) </A>
 * 
 * @version v1.0 10/9/2024
 * 
 */

public class TemperatureConversion {

	/**
	 * The main method prints a Celcius to Fahrenheit conversion table. The bounds
	 * of the table range from -50C to +50C in 10-degree increments.
	 * 
	 * @param args are not used in this implementation
	 */

	public static void main(String[] args) {
		final double TABLE_BEGIN = -50;
		final double TABLE_END = 50;
		final double TABLE_STEP = 10.0;
		double celsius;
		double fahrenheit;
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("---------------------------");
		System.out.println("Celsius       Fahrenheit");
		for (celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF%n", fahrenheit);
		}
		System.out.println("---------------------------");
	}

	/**
	 * Convert a temperature from Celsius degrees to Fahrenheit degrees
	 * 
	 * @param celsius  A temperature in Celsius
	 * @return The temperature converted to Fahrenheit
	 * 
	 * @exception java.lang.IllegalArgumentException Celsius must be larger than -273.16 
	 * 
	 * 
	 * 
	 * @custom.precondition celsius >= -273.16
	 */
	public static double celsiusToFahrenheit(double celsius) {
		final double MINIMUM_CELSIUS = -273.16;
		if(celsius < MINIMUM_CELSIUS) {
			throw new IllegalArgumentException("Argument " + celsius +  " is too small");
		}
		
		
		return (9.0/5.0) * celsius + 32;
	}

}
