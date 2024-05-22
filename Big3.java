class Big3 
{
	public static void main(String[] args) 
	{
		int a,b,c,big=0;
		a=10;
		b=5;
		c=20;

		if(a>b)
			if(a>c)
				big=a;
			else
				big=c;
		else
			if(b>c)
				big=b;
			else
				big=c;

	System.out.println("Biggest no is:"+big);



				
	}
}
