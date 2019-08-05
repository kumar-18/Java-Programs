import java.util.Scanner;
class arr_inp{
  public static void main(String[] args) {
    int n;
    Scanner a=new Scanner(System.in);
    System.out.print("Enter array size::");
    n=a.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements::");
    for (int i=0;i<n;i++ ) {
      arr[i]=a.nextInt();
    }
    System.out.print("entered array is::");
    for (int i=0;i<n ;i++ ) {
      System.out.print(arr[i]+" ");
    }
    System.out.print("Enter search element");
    int s=a.nextInt();
    for (int i=0;i<n ;i++ ) {
      if(arr[i]==s)
      {
        System.out.print("element found at position="+i;
        break;
      }
      if (i==n-1)
      {
        System.out.println("element Not found");
      }
    }

  }
}
