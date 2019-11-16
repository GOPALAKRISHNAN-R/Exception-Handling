package try_catch_finally;

public class Sample3 
{
	public static void main(String args[])
	{
		try
		{
		int d[]=new int[2];
		d[0]=11;
		d[1]=10;
		d[2]=0;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This Finally block.....");
		}

	}

}
