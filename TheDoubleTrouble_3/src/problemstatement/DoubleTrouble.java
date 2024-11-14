package problemstatement;
import java.util.*;
public class DoubleTrouble {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer:");
	int num=sc.nextInt();
	System.out.println(doubleTheNumber(num));
	sc.close();
}
public static int doubleTheNumber(int num)
{
	return num*2;
}
}
