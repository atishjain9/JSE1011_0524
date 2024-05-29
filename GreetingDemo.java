class GreetingDemo 
{
	public static void main(String[] args) 
	{
		sayGreeting("Core Java","Atish Jain");
		sayGreeting("Python","Vishnu");
	}

	public static void sayGreeting(String cname,String fname)
	{
		System.out.println("Welcome to "+cname+" Classes...by "+fname);
	}

}
