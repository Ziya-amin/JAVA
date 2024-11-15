import java.util.Scanner;

public class assig_4 {

    static int intersection(int[] arr1, int[] arr2) {
        int low=0;
        int high= arr2.length-1;
        int ans=0;
        while (low<= high) {
            int i=0;
            int mid =(high+low)/2;
            if (arr2[mid]==arr1[i]) {
                ans = arr1[i];
                return ans;
            }
            else if (arr2[mid]<arr1[i]) {
                low=mid+1;               
            }
            else
            high=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for(int i=0; i<size; i++){
            arr1[i] = sc. nextInt();
        }
        int[] arr2 = new int[size];
        for(int i=0; i<size; i++){
            arr2[i] = sc. nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i=0; i<size; i++){
            System.out.print(arr2[i]);
        }
        sc.close();
    }
    
}
