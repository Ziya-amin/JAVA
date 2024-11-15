package DAY_12;
import java.util.Scanner;

public class TwoD_Array {

    static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static Scanner sc= new Scanner(System.in);
    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }
    // static int[][] populate(int[][] arr){
    //     // for(int i=0; i<=r; i++){
    //     //     for(int j=0; j<=c; j++)
    //     //         arr[i][j]=sc.nextInt();
    //     // }
    //     //return arr;
    // }
    public static void main(String[] args) {
        // System.out.print("Enter the rows : ");
        // int r= sc.nextInt();
        // System.out.print("Enter the col : ");
        // int c= sc.nextInt();
        // int[][] arr= new int[r][c];
        int[][] nums= {
            {1,4,3},
            {8,6,7},
            {2,5,9}
        };
        populate(nums);
        display(nums);
        // arr= populate(nums);
        // System.out.println(arr);
        //display(arr);
        

    }
    
}
