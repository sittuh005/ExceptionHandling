import java.util.InputMismatchException;
import java.util.Scanner;

public class PolymorphicCatch 
{
	public static void main(String[] args)
	{
		int a[]={10,20,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int index[0-2]:");
		try
		{
		int index=sc.nextInt();
		System.out.println("Element="+a[index]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
			System.out.println("Invalid index,using 0 as default index");
			System.out.println("Element="+a[0]);
		}
		System.out.println("Bye");
		sc.close();
	}
}
