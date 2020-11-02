class ViewMyBalance extends BankDataBase
{
	Authentication aut=new Authentication();
	BankDataBase bdb=new BankDataBase();
	int acno=aut.getaccountnumber();
	private int balance;
	public int getBalance()
	{
		int m=bdb.accountposition(acno);
	    balance=balancelist.get(m);
		return balance;
	}
}
