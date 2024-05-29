class ArgAdd 
{
	public static void main(String[] args) 
	{
		if(args.length!=2)
		{
			System.out.println("Invalid no of arguments...");
			System.exit(0);
		}

		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		c=a+b;

		System.out.println("Result is:"+c);

	}
}
