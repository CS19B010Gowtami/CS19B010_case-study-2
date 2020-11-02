public class CS19B010 
{
	public static void main(String[] args) 
	{
		boolean isvalid=false;
        Scanner sc = new Scanner(System.in);
	    MyClass obj=new MyClass();//object of MyClass
	    Authentication aut=new Authentication();
	    int yn = 0;
	    keypad keypad1=new keypad();
	    outerprinter.welcome();
	    do
	    {
	        isvalid=aut.valid();
	    }
	    while(!isvalid);
	    do 
	    {
	    	obj.myMenu();
	        outerprinter.DisplayMessageln("do you want to exit:");
	        outerprinter.DisplayMessageln("Choose 1(for yes) or 0(for no)");
	        yn = keypad1.getInput();
	    }
	    while (yn==0);
        if(yn==1)
        {
        	outerprinter.end();
        }
      }
}
