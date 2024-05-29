class MobileNoCount 
{
	public static void main(String[] args) 
	{
		long mno=998924151L;

		int d=0;

 
		while(mno>0)
		{
			mno=mno/10;
			d++;
		}
		System.out.println("No of Digits are:"+d);
	}
}
