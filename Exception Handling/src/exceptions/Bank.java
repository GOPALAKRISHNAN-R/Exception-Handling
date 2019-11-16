package exceptions;

import exceptions.InvalidAmountException;
import exceptions.InsufficientFundException;

public interface Bank 
{
	void balanceEnquiry();
	void deposit(double amt)throws InvalidAmountException;
	double withdrawn(double amt)throws InsufficientFundException;
}
