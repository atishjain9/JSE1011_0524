//jagged arrays
class ArrayDemo4
{
	public static void main(String[] args) 
	{
		int a[][]=new int[4][];
		a[0]=new int[5];
        a[1]=new int[2];
        a[2]=new int[8];
        a[3]=new int[3];
     
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
