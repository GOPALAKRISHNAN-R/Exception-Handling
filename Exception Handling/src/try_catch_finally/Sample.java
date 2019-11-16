package try_catch_finally;

public class Sample 
{
	public static void main(String[] args)
	{
		
		try
		{
			
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception..");
		}
		finally
		{
			System.out.println("This Finally block.....");
		}

		
	}

}
