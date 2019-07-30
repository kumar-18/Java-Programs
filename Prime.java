class Prime
{
  public static void main(String[] args) {
    int i=0,c=0,n=100,j=0;
    for (i=1;i<n;i++) {
      for (j=1;j<i;j++ ) {
        if (i%j==0) {
          c++;
        }
      }
      if(c==1)
      {
        System.out.println(i);
        c=0;
      }
      c=0;
    }
  }
}
