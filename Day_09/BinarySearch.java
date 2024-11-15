package Day_09;
import java.util.Arrays;
public class BinarySearch {

    static boolean binarySearch(int[] arr, int k) {
        int low=0;
        int high= arr.length-1;
        while (low<= high) {
            int mid =(high+low)/2;
            if (arr[mid]==k) {
                return true;
            }
            else if (arr[mid]<k) {
                low=mid+1;               
            }
            else
            high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={6,7,8,9,10,11,12,13,1,2,3,4};
        int k=8;
        Arrays.sort(arr);
        boolean b= binarySearch(arr, k);
        System.out.print(b);
    }
    
}
