class WhileDemo 
{
	public static void main(String[] args) 
	{
		int tno,c,res;
		tno=5;
		c=1;
		res=0;

		while(c<=12)
		{
		 res=tno*c;
		 System.out.printf("%d * %d = %d\n",tno,c,res);
		 c++;
		}
	}
}
