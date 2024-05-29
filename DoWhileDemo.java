class DoWhileDemo 
{
	public static void main(String[] args) 
	{
		int tno,c,res;
		tno=5;
		c=100;
		res=0;

		do
		{
		 res=tno*c;
		 System.out.printf("%d * %d = %d\n",tno,c,res);
		 c++;
		}while(c<=12);
	}
}
