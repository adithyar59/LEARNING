package problemstatement;

import java.util.Scanner;
public class ArithmeticDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println(galacticAddition(num1,num2));
		sc.close();
		}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
