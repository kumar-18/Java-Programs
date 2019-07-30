class Sample
{
   public static void main(String[] arg)
   {
   int i=0;
     do{
     System.out.print(i);
     i++;
        if(i==5)
        {
         continue;
        }
     }while(i<10);
   }
}
