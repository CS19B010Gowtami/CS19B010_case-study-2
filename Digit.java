class Digit
{
	public static int size(int acno)
	{
		int temp=acno;
		int sum=0;
		while(temp!=0)
		{
			temp/=10;
			sum++;
		}
	    return sum;
	}
	public static int getdigit(int m,int acno)
	{
		int n=size(acno), k=n-1;
		int a[]=new int[n];
	    for(int i=0;i<n;i++) 
		{
			a[k--]=acno%10;
			acno/=10;
	    }
		return a[m-1];
	}
}
