class EFor 
{
	public static void main(String[] args) 
	{
		int arr[]={12,34,56,78};
		double d[]={12.45,45.67,89.90};
		String str[]={"Raj","Prem","Hari","Muskan","Priya"};

		

		for(int i:arr)
		{
			System.out.println(i);
		}

		System.out.println("--------------------");
		

		for(double i:d)
		{
			System.out.println(i);
		}

	
		System.out.println("--------------------");


		for(String i:str)
		{
			System.out.println(i);
		}


	}
}
