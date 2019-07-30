class fibonacci{
  public static void main(String[] args) {
    int  a=0,b=1,n=15,sum=0;
    while(sum<n)
    {
      sum=a+b;
      b=a;
      a=sum;
      System.out.print(sum);
    }
  }
}
