//jagged arrays
class ArrayDemo3
{
	public static void main(String[] args) 
	{
		int a[][]={
			        {1,2,3,9,8,9},
			        {4,5},
			        {7,7,8,9,8}	 
		          };

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
