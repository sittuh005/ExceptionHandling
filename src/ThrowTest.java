import java.util.Calendar;
import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Birth Year:");
		int birthYear=sc.nextInt();
		if(birthYear<0)
		{
			ArithmeticException ae=new ArithmeticException();
			throw ae;
		}
		else
		{
		Calendar c=Calendar.getInstance();
		int currentYear=c.get(Calendar.YEAR);
		int age=currentYear-birthYear;
		System.out.println("Age="+age);
		}
		sc.close();
	}
}
