package zad1;

public class Account 
{
	private static double interest_rate; 
	private double balance;
	
	public Account()
	{
		balance = 0; 
	}
	
	public void deposit (double k)
	{ 
		if(k <  0){
			System.out.println("Nie mozna tego zrobic");
		}
		else balance += k; 
	}
	
	public void withdraw (int k)
	{
		if(getBalance() < k) System.out.println("You dont have money");
		else balance -= k;
		
	}
	
	public void  transfer (Account j, int k)
	{
		if(getBalance() >= k) 
		{ 	
			withdraw(k);
			j.deposit(k);
		}
		else System.out.println("You dont have money");
			
	}
	
	public static void setInterestRate(double irate)
    {
        interest_rate = 1+(irate/100);
    }
	
	public void addInterest()
	{
		balance *= interest_rate; 
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
}


