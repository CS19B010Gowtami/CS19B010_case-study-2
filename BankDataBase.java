class BankDataBase 
{
	int i=15,p;
	private int acno;
    ArrayList<Integer>accounts=new ArrayList<Integer>();
	ArrayList<Integer>pins=new ArrayList<Integer>();
	ArrayList<Integer>balancelist=new ArrayList<Integer>();
	BankDataBase()
	{
		for(int j=0;j<15;j++)
		{
			accounts.add(j,j+9998);
			pins.add(j,(j+6567)+679);
			balancelist.add(j,j+98760);
		}
	}
	public void RegisterAccount(int acno,int pinno)
	{
		int b=Digit.getdigit(3,acno)*10+Digit.getdigit(4,acno)*654+Digit.getdigit(5,acno)*45+Digit.getdigit(2,acno)*1048;
		this.acno=acno;
	    accounts.add(i,acno);
		pins.add(i,pinno);
		balancelist.add(i,b);
	    i++;
	    System.out.println("Your accountno("+(acno)+")is registered successfully with pin "+Digit.getdigit(1,pinno)+"***"+Digit.getdigit(5,pinno));
	  }
	 private boolean searchacno(int acno)
	 {
		long n=accounts.size();
		int k=0,p=0;
		for(i=0;i<n;i++)
		{
			if(acno==accounts.get(i))
			{
				p=i;
			    k=1;
				break;
			}
		}
		if(k==1)
			return true;
		else
			return false;
	}
	public boolean issearchacno(int acno)
	{
		return searchacno(acno);
	}
	private boolean searchpinno(int acno,int pinno)
	{
		long n=accounts.size();
		int k=0;
		for(i=0;i<n;i++)
		{
			if(pinno==pins.get(i))
			{
				k=1;
				break;
			}
		}
		if(k==1&&accounts.get(i)==acno)
		{
			p=i;
	        return true;
		}
		else
			return false;
	}
	public boolean issearchpinno(int acno,int pinno)
	{
		return searchpinno(acno,pinno);
	}
	public int accountposition(int acno)
	{
		return p;
	}
}
