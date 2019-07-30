import java.lang.Math;
class armstrong{
 public static void main(String[] args) {
   int n=153,c=0,N=0,r=0;
   double sum=0;
   N=n;
   int S=N;
   while(n!=0)
   {
     c++;
     n=n/10;
   }
   while(N!=0)
   {
     r=N%10;
     sum=sum+ java.lang.Math.pow(r,c);
     N=N/10;
   }
   System.out.print(sum);
   if(sum==S){
   System.out.print("armstrong");
 }
 else
 {
   System.out.print("Not a armstrong");
 }
 }
}
