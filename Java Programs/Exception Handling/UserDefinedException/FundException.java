//User defined Exception
class FundException extends Exception
{
	double amt;
	FundException(double p)
	{
		amt=p;
	}
	void getMsg()
	{
		System.out.println("Fund Required : "+amt);
	}
}
