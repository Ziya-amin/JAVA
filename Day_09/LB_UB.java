package Day_09;

public class LB_UB {
    static int lowerBound(int[] arr, int num) {
        int low=0;
        int high= arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (high+low)/2;
            if (num==arr[mid]) {
                ans = mid;
                high = mid-1;                
            }
            if (num>arr[mid]) {
                low=mid+1;                
            }
            if (num<arr[mid]) {
                high=mid-1;
            }
        }
        return ans;
    }

    static int uperBound(int[] arr, int num) {
        int low=0;
        int high= arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (high+low)/2;
            if (num==arr[mid]) {
                ans = mid+1;
                low = mid+1;                
            }
            if (num>arr[mid]) {
                low=mid+1;                
            }
            if (num<arr[mid]) {
                high=mid-1;
            }
        }
        return ans;
    }


    public static int count(int[] arr, int num) {
        int count = uperBound(arr, num)-lowerBound(arr, num);
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,2,3,4,4};
        int num=2;
        int b=lowerBound(arr, num);
        int c=uperBound(arr, num);
        System.out.println(b);
        System.out.println(c);
        System.out.println(count(arr, num));
    }
    
}
