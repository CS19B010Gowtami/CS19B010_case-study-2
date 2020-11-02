class keypad
{
	private Scanner input;
	keypad()
	{
		input=new Scanner(System.in);//object of scanner class
	}
	public int getInput()
	{
		return input.nextInt();//ATM keyboard only has integers
	}
}
