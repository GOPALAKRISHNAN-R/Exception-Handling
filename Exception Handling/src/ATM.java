import java.util.Scanner;
import exceptions.HDFCBank;
import exceptions.InsufficientFundException;
import exceptions.InvalidAmountException;

/**
 * Simple Java program for Custom Exception.
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class ATM 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		try
			
		{
			HDFCBank obj=new HDFCBank();
			System.out.println("Welcome to HDFC Bank...");
			System.out.println("1.Balance Enquiry \n2.Deposit \n3.Withdraw");
			
			String con;
			do
			{
				System.out.println("Enter the option:");
				Scanner sc=new Scanner(System.in);
				int op=sc.nextInt();
				switch(op)
				{
				case 1:
					obj.balanceEnquiry();
					break;
				case 2:
					System.out.println("Enter the deposit amount(Rs.):");
					double amt=sc.nextDouble();
					obj.deposit(amt);
					break;
				case 3:
					System.out.println("Enter Withdraw amount(Rs.):");
					double at=sc.nextDouble();
					obj.withdrawn(at);
					obj.balanceEnquiry();
					break;
				default:
					System.out.println("Invalid option...");
						
				}
			System.out.println("Do transction(yes/no):");
			con=sc.next();
			}while(con.equalsIgnoreCase("yes"));
	
		}
		catch(InvalidAmountException e1)
		{
			System.out.println(e1);
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
