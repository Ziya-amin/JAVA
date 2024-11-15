

//import java.util.Scanner;

public class Practice {
    // static void display(int[] arr){
    //     for(int i:arr)
    //         System.out.print(i+" ");
    // }

    // static void shiftByOne(int[] arr) {
    //     int key = arr[arr.length-1];
    //     for(int i= arr.length-1;i>0;i--)
    //         arr[i]=arr[i-1];
    //     arr[0]= key;            
    // }

    // static void reverse(int[] a, int n) {
    //     // int start = 0;
    //     //int end = n - 1;
        
    //     // // Loop to swap elements
    //     // while (start < end) {
    //     //     // Swap the elements
    //     //     int temp = a[start];
    //     //     a[start] = a[end];
    //     //     a[end] = temp;
         
    //     //     // Move to the next positions
    //     //     start++;
    //     //     end--;
    //     // }
    //     // while (start==2 && start>end) {
    //     //     int temp = a[start];
    //     //     a[start] = a[end];
    //     //     a[end] = temp;
    //     //     start++;
    //     //     end--;
    //     // }          
        
        
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     //int k=3;
        
    //     //for(int i=0;i<k;i++)
    //     //    shiftByOne(arr);
    //     //display(arr);

    //     reverse(arr, arr.length);
        
    //     display(arr);
    // }
    // static void shiftByOne(int[] arr) {
    //     int key=arr[arr.length-1];
    //     for(int i=arr.length-1; i>=0; i--){
    //         arr[i]=arr[i-1];
    //     arr[0]= key;
    //     }
    // }
    // public void rotate(int[] nums, int k) {
    //     int[] arr={1,2,3,4,5,6,7};
    //     shiftByOne(arr);
    // }



    // Assign qes 
    // Scanner sc= new Scanner(System.in);
    // int size= sc.nextInt();
    // int[] arr = new int[size];
    // for(int i=size; i<size; i++){
    //     arr[i]=sc.nextInt();
    // }
    // int sum=0;
    // int sum2=0;
    // for(int i=0; i<size; i++){
    //     if (i%2!=0) {
    //         sum +=arr[i];            
    //     }
    //     else{
    //         sum2 +=arr[i];
    //     }
    // }
    // System.out.println(sum);
    // System.out.println(sum2);




//public class RotateArray {
        static void display(int[] arr){
            for(int i:arr)
                System.out.print(i+" ");
                }
        public static void rotateUsingIndex(int[] arr, int k) {
            int[] temp= new int[arr.length];
            int n= arr.length;
            for(int i=0; i<n-k; i++){
                temp[i+k]= arr[i];
            }
            for(int i=0; i<k; i++){
                temp[i]= arr[n-k+i];
            }
            for(int i=0; i<n; i++){
                arr[i]=temp[i];
            }
    }
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,1};
        //int k=10;
        display(arr);
    }
}

