class Authentication extends Digit
{
	private int acno;
	private int pinno,userpin;
	boolean yn,n=false;
	BankDataBase bdb=new BankDataBase();
    public boolean valid()
	{
		keypad keypad1=new keypad();
		outerprinter.DisplayMessageln("please Enter your Account no.");
		this.acno=keypad1.getInput();
		if(Digit.size(acno)==5)
		{
			 yn=bdb.issearchacno(acno);
	    }
		else
		{
			outerprinter.DisplayMessageln("please enter valid five digit account number");
		}
		if(yn==false&&Digit.size(acno)==5)
		{
			outerprinter.DisplayMessageln("Your account no. is not registered in our bank database");
			outerprinter.DisplayMessagelninred("please register your account number in bank");
		   outerprinter.DisplayMessageln("please enter ur pin for registration");
			userpin=keypad1.getInput();
			if(Digit.size(userpin)==5)
			{
				bdb.RegisterAccount(acno, userpin);
		        yn=bdb.issearchacno(acno);
			}
			else
			{
				while(Digit.size(userpin)!=5)
				{
					outerprinter.DisplayMessageln("please enter valid five digit pin number");
					userpin=keypad1.getInput();
					if(Digit.size(userpin)==5)
					{
						bdb.RegisterAccount(acno, userpin);
				        yn=bdb.issearchacno(acno);
				        break;
					}
				}
			 }
		 }
		if(yn==true)
		{
			outerprinter.DisplayMessageln("please enter ur pin to continue");
			pinno=keypad1.getInput();
			n=bdb.issearchpinno(acno,pinno);
		}
		return n;
	}
    public int getaccountnumber()
    {
    	return acno;
    }
}
