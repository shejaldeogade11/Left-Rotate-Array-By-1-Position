package Array;

public class LeftRotedByOne {
    public static void leftRoteted1(int arr[]){
        int n=arr.length;
        //****** This is Brute force approach Time complexity O(n) Space Complexity O(n)  *****/
        // int temp[]= new int[n];  //sace complexity O(n)
        // for(int i=0;i<n-1;i++){
        //     temp[i]= arr[i+1];
        // }
        // temp[n-1]=arr[0];
        // for(int i=0;i<n;i++){
        //     System.out.print(temp[i]+" ");
        // }


   //****** This is Optimal approach Time complexity O(n) Space Complexity O(1)  *****/
          int temp=arr[0];
          for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
          }
          arr[n-1] = temp;
          for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
         }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.err.println("Before my array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println("\nAfter rotating by one array");
        leftRoteted1(arr);
    }
}
