class ContinueDemo 
{
	public static void main(String[] args) 
	{
		for(int no=1;no<=10;no++)
		{
			if(no%5==0)
				continue;

			System.out.println(no);
		}

		System.out.println("Out of the loop");
	}
}
