class CmdDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(args.length);

		String str=args[0];

		if(str.equals("Windows"))
			System.out.println("Windows Enviornment Setup....");
		else
			if(str.equals("Linux"))
					System.out.println("Linux Enviornment Setup....");
			else
					System.out.println("Invalid Platform....");




	}
}
