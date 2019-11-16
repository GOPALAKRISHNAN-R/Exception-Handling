package try_catch_finally;

public class Sample2 {
	void display()
	{
		System.out.println("hi...");
	}

	public static void main(String[] args) 
	{
		try
		{
			//Sample2 s=null;
			Sample2 s=new Sample2();
			s.display();
			

		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

		finally
		{
			System.out.println("This Finally block.....");
		}

	}

}
