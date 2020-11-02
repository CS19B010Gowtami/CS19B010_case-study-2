class DepositSlot extends WithDrawal
{
	public void deposit()
	{
		keypad keypad1=new keypad();
		outerprinter.DisplayMessageln("please enter the amount to deposit  or choose 0 for cancellation");
	    int temp=keypad1.getInput();
	    int balance=getBalance();
	    if(temp!=0)
    	{
    		int m=bdb.accountposition(acno);
    	    balancelist.add(m,balance+temp);
    	    balance=getBalance();
    	    outerprinter.DisplayMessageln("Please send the envelop....");
    	    outerprinter.DisplayMessage("your present balance is:");
    	    outerprinter.DisplayDoubleMessagelninred(balance);
    	    outerprinter.DisplayMessageln("(in rupees)");
    	}
        else
    	{
    		outerprinter.DisplayMessagelninred("Cancelling your transaction.....");
    	}
	}
}
