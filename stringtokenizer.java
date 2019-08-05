import java.util.StringTokenizer;
class stringtokens
{
	public static void main(String[] args)
	{
	     StringTokenizer ob=new StringTokenizer("jaya supriya somasani");
	    
	     StringTokenizer ob1=new StringTokenizer("jaya,somasani,sandhya", ",");
	    
	     StringTokenizer ob2=new StringTokenizer("jaya , somasani, sandhya,rani",",", true);

	     StringTokenizer ob3=new StringTokenizer("jaya,supriya,somasani");

	   /* System.out.println(ob2.nextToken());
		System.out.println(ob2.nextToken());*/
		System.out.println(ob2.nextToken());

		/*System.out.println(ob.countTokens());*/
		/*while(ob.hasMoreTokens())
		{

			System.out.println(ob.nextToken());
		}*/
		System.out.println(ob);
	}
}