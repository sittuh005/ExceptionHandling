import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) 
	{
	//ArithmeticException ae=new ArithmeticException();
	try
	{
		FileNotFoundException ae=new FileNotFoundException();
	//IOException ae=new IOException();
	throw ae;
	}catch(Exception e)
	{}
	}

}
