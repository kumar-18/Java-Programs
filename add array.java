class add_arr
{
public static void main(String[] args) {
  int sum=0;
  int arr[]=new int[]{5,2,5,6,7,4};
  for (int i=0;i<arr.length ;i++ ) {
    sum=sum+arr[i];
  }
    System.out.print(sum);
}
}
