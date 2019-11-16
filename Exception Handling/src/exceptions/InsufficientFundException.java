package exceptions;

@SuppressWarnings("serial")
public class InsufficientFundException extends Exception
{
	public InsufficientFundException()
	{
		super();
	}
	public InsufficientFundException(String msg)
	{
		super(msg);
	}
}
