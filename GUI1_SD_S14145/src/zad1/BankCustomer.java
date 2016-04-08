package zad1;

public class BankCustomer 
{
	private Person cust;
	private Account acc;

	public BankCustomer(Person customer) 
	{
		this.cust = customer;
		this.acc = new Account();
	}
	
	public Account getAccount()
	{
		return acc;
	}
	
	public String toString()
	{
        return String.format("Klient: %-3s, stan konta %7.2f ", cust.getName(), acc.getBalance());
    }

	
}
