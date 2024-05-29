class MethodOverloadingDemo 
{
	public static void main(String[] args) 
	{
		add(10,20);
		add(300,200);
		add(1,2,3);
		add(12.50,6.90);
	}


	public static void add(double x,double y)
	{
		System.out.println("double,double: "+(x+y));
	}
	

	public static void add(int x,int y,int z)
	{
		System.out.println("int,int,int: "+(x+y+z));
	}

}
