class perfect
{
	public static void main(String[] args)
	{
		int n=2,i=1,s=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		if(s==n)
		{
			System.out.println(n+"is a perfect Number");
		}
		else
		{
			System.out.println(n+"is not a perfect Number");	
		}
		
	}
}