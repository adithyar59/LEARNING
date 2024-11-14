package problemstatement;
import java.util.*;
public class TemperatureConverterApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Temperature in Fahrenheit to convert into Celsius:");
	double f1=sc.nextDouble();
	sc.close();
	TemperatureConverter t=new TemperatureConverter();
	System.out.println(t.convertFahrenheitToCelsius(f1));
}
}
