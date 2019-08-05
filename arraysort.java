class array
{
	public static void main(String[] args)
	{
	   int ar[]={45,19,67,12,34,83};
	   int n=ar.length;
	   int temp,i,j;
	   System.out.print("given list is ");
	   for( i=0;i<n;i++)
	   {
	    	System.out.print(" "+ar[i]);
	   }
	   System.out.println();
	   for(i=0;i<n;i++)
	   {
		for(j=i+1;j<n;j++)
		{
		    if(ar[i]>ar[j])
		    {
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		    }
		}
	    }
	    for(i=0;i<n;i++)
	    {
		System.out.print( "  "+ar[i]);
	    }
	    System.out.println(" ");
	}
}
