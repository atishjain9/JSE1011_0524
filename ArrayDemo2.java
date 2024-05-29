class ArrayDemo2
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][5];

     for(int r=0;r<a.length;r++)
	 {
        for(int c=0;c<a[r].length;c++)
			{
			 System.out.print(a[r][c]+" ");
			}
	    System.out.println();
	 }
		
	}
}
