package problemstatement;
import java.util.*;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Speed and Time to calculate Distance:");
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		sc.close();
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed,time));
	}

}
