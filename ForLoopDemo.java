class ForLoopDemo
{
	public static void main(String[] args) 
	{
		int tno,res;
		tno=5;
		res=0;

        for(int c=1;c<=12;c++)
		{
		 res=tno*c;
		 System.out.printf("%d * %d = %d\n",tno,c,res);
		}	
	}
}
