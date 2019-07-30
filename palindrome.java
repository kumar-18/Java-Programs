class palindrome{
 public static void main(String[] args) {
   int n=122,sum=0,r=0,N=0;
   N=n;
   while(n!=0)
   {
     r=n%10;
     sum=(sum*10)+r;
     n=n/10;
   }
   if(sum==N)
   {
     System.out.print(N+" is a palindrome Number");
   }
   else
   {
      System.out.print(N+" is not a palindrome Number");
   }


 }
}
