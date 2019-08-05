import java.lang.String;
class Str
{
	public static void main(String[] args)
	{
	   String a="jaya";
	   System.out.println(a);
	   String s1=new String();
	   s1="somasani";
	   System.out.println(s1);
	   String s2=new String("priya");
	   System.out.println(s2);
	
	   char str[]={'s','a','n','d','h','y','a'};
	   String b=new String(str);
	   System.out.println(b);

	   String s3=new String(str,0,5);
	   System.out.println(s3);

	}
}
