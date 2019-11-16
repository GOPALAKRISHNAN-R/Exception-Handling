package throws_ex;

import java.util.Scanner;

public class ThrowsEx {

	public int div(int a,int b)throws Exception
	{
		int c=a/b;
		return c;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		try
		{
		ThrowsEx e=new ThrowsEx();
		System.out.println("Enter x value:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter y value:");
		int y=sc.nextInt();
		System.out.println(e.div(x, y));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
