class leap
{
	public static void main(String[] args)
	{
	    int year=2001;
	    if((year%4==0)&&(year%100!=0)||(year%400==0))	
	    {
		System.out.print(" given year is a leap year");
	    }
	    else
	    {
		System.out.print("it is not a leap year");
	    }
	}
}