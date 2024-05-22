class VendingMachine 
{
	public static void main(String[] args) 
	{
		int choice=9;

		String result=null;
		switch(choice)
		{
			case 1: result="Espresso"; break;
			case 2: result="Cappuccino";break;
			case 3: result="Black Coffee"; break;
			case 4: result="Latte";break;
			case 5: System.exit(0);
			default: result="Invalid Choice";
		}

		System.out.println(result);
	}
}







