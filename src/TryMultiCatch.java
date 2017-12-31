import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMultiCatch 
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
		catch(InputMismatchException ne)
		{
			System.out.println("Invalid int index,using 0 as default index");
			System.out.println("Element="+a[0]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Invalid range of index,using 0 as default index");
			System.out.println("Element="+a[0]);
		}
		System.out.println("Bye");
		sc.close();
	}
}
