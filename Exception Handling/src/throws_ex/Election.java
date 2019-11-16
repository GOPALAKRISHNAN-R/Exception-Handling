package throws_ex;

import java.util.Scanner;

public class Election 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("WELCOME TO ONLINE VOTE...");
			int age;
			String name;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Candidate name:");
			name=sc.next();
			System.out.println("Enter Age:");
			age=sc.nextInt();
			if(age<18)
			{
				throw new Exception("Not Eligible for voting...Mr./Mrs."+name);
			}
			System.out.println("Eligible to vote..");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Thanks for voting..");
		}


	}

}
