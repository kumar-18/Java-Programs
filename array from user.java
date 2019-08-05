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
    for (int i=0;i<n ;i++ ) {
      System.out.print(arr[i]+" ");
    }
  }
}
