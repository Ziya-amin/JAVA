package DAY_05;
import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    static int searchForGivenNmb(int[] arr, int k) {
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==k){
                return (i);
            }
        }
        return ans;
    }

    static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0; i<temp.length; i++){
            temp[i]=arr[arr.length-1-i];
        }
        return temp;
    }

    static boolean armStrong(int n){
        int len=0;
        int temp=n;
        while (temp!=0) {
            temp/=10;
            len++;            
        }
        int sum=0;
        temp=n;
        while (temp!=0) {
            sum+= (int)Math.pow(temp%10, len);
            temp/=10;
        }
        return(sum==n);
    }
    public static void main(String[] args) {


        //ARMSTRONG NUMBER
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int n= sc.nextInt();
        // System.out.print(armStrong(n));



        // SEARCH FOR GIVEN NUMBER 
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the array size : ");
        // int size= sc.nextInt();
        // int[] arr= new int[size];
        // System.out.println("Enter the elements : ");
        // for(int i=0; i<size; i++){
        //     arr[i]= sc.nextInt();
        // }
        // System.out.print("Enter the number you want to search : ");
        // int k =sc. nextInt();
        // int b = searchForGivenNmb(arr, k);
        // System.out.println("number index is : " + b);



        //REVERSE NUMBER
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int temp[]= reverseArray(arr);
        System.out.print("Reverse Array : ");
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseArray(arr)));      //predefine function = Array.toString()
        sc.close();
    }
}
