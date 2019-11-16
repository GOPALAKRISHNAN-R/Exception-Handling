package exceptions;

public class HDFCBank implements Bank 
{
	private double balance=500;

	
	public void balanceEnquiry()
	{
		System.out.println("Current balance:"+balance);
	}
	
	public void deposit(double amt)throws InvalidAmountException
	{
		if(amt<=0)
		{
			throw new InvalidAmountException(amt+"is invalid amount...");
		}
		balance=balance+amt;
	}
	
	public double withdrawn(double amt)throws InsufficientFundException
	{
		if(amt>balance)
		{
			throw new InsufficientFundException(amt+"not enough money");
		}
		balance=balance-amt;
		return balance;
	}
}
