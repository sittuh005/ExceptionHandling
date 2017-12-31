import java.io.IOException;

public class ThrowsTest 
{
	static void fun() throws IOException
	{
		//IOException e=new IOException();
		A a=new A();
		throw a;
	}
	public static void main(String[] args) 
	{
		try
		{
			fun();
		}catch(IOException e)
		{}
	}

}
class A extends ArithmeticException
{}