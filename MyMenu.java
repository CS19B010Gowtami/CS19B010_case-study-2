class MyMenu extends outerprinter
{   
	keypad keypad1=new keypad();
	Scanner sc = new Scanner(System.in);
    public void myMenu()
    { 
    	int t;
       outerprinter.DisplayMessageln("Please enter your choice:");
       outerprinter.DisplayMessageln("1.view my balance");
       outerprinter.DisplayMessageln("2.withdraw cash");
       outerprinter.DisplayMessageln("3.Deposit funds");
   	   t=keypad1.getInput();
       if(t==1||t==2||t==3)
       {
		   if(t==1)
		   {
			  double balance;
			  ViewMyBalance vmb=new ViewMyBalance();
			  balance=vmb.getBalance();
			  outerprinter.DisplayMessage("Your Present Balance is:");
			  outerprinter.DisplayDoubleMessageinred(balance);
			  outerprinter.DisplayMessageln("(in rupees)");
		  }
		  else if(t==2)
		  {
			  WithDrawal wd=new WithDrawal();
			  wd.withdrawing();
		  }
		  else if(t==3)
		  {
			  DepositSlot ds=new DepositSlot();
			  ds.deposit();
		  }
       }
       else
       {
    	  while(t!=1&&t!=2&&t!=3)
          {
       	   outerprinter.DisplayMessageln("Invalid input!!please try again");
       	   outerprinter.DisplayMessageln("Please enter your choice again:");
       	   outerprinter.DisplayMessageln("1.view my balance");
           outerprinter.DisplayMessageln("2.withdraw cash");
           outerprinter.DisplayMessageln("3.Deposit funds");
    	   t=keypad1.getInput();
    	   if(t==1||t==2||t==3)
          {
    		if(t==1)
		    {
			  double balance;
			  ViewMyBalance vmb=new ViewMyBalance();
			  balance=vmb.getBalance();
			  outerprinter.DisplayMessage("Your Present Balance is:");
			  outerprinter.DisplayDoubleMessagelninred(balance);
			  outerprinter.DisplayMessageln("(in rupees)");
		    }
    		   else if(t==2)
		    {
    			WithDrawal wd=new WithDrawal();
  			    wd.withdrawing();
		    }
		    else if(t==3)
		   {
		    	DepositSlot ds=new DepositSlot();
				ds.deposit();
		   }
          }   
         }
       }
   }
}
