import java.util.Scanner;

public class TryFinally 
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
		finally
		{
			sc.close();
			System.out.println("this is finally");
		}
		System.out.println("Bye");
	}
}
