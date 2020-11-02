class WithDrawal extends ViewMyBalance
{
   public void withdrawing()
   {
	   keypad keypad1=new keypad();
	   Authentication aut=new Authentication();
	   int acno=aut.getaccountnumber();
	   outerprinter.DisplayMessage("Enter the amount you want to withdraw ");
	   outerprinter.DisplayMessageln("or choose 0 for cancellation");
	   int temp=keypad1.getInput();
	   int balance=getBalance();
	   if(temp!=0)
	   {
		   while(temp>balance)
		   {
			  outerprinter.DisplayMessageln("YOU DONT HAVE ENOUGH BALANCE");
			  outerprinter.DisplayMessageln("please enter smaller amounts or 0 for cancellation");
			  temp=keypad1.getInput();
			  if(temp<=balance)
				  break;
			}
		    if(temp<=balance)
		    {
		    	if(temp!=0)
		    	{
		    		int m=bdb.accountposition(acno);
		    	    balancelist.add(m,balance-temp);
		    	    balance=getBalance();
		    	    outerprinter.DisplayMessageln("Please take your amount....");
		    	    outerprinter.DisplayMessage("your present balance is:");
		    	    outerprinter.DisplayDoubleMessageinred(balance);
		    	    outerprinter.DisplayMessageln("(in rupees)");
		    	}
		        else
		    	{
		    		outerprinter.DisplayMessagelninred("Cancelling your transaction.....");
		    	}
		    }
		 }
	   else if(temp<=0)
	   {
		   outerprinter.DisplayMessageln("Cancelling your transaction.....");
	   }
	 }
}
