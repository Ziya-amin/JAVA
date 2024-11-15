package DAY_08;

public class NGEL {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
            }

    static int[] NGEL_no(int[] arr) {
        int maxe=0;
        int[] ngel = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ngel[i]= maxe;
            maxe = Math.max(maxe, arr[i]);
        }
        return ngel;    
    }

    static int[] NGER_no(int[] arr) {
        int maxe=0; 
        int[] nger = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            nger[i]= maxe;
            maxe = Math.max(maxe, arr[i]);
        }
        return nger;    
    }

    static int[] NSER_no(int[] arr) {
        int min_e=Integer.MAX_VALUE; 
        int[] nser = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            nser[i]= min_e;
            min_e = Math.min(min_e, arr[i]);
        }
        return nser;    
    }

    static int[] NSEL_no(int[] arr) {
        int min_e=Integer.MAX_VALUE;
        int[] nsel = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            nsel[i]= min_e;
            min_e = Math.min(min_e, arr[i]);
        }
        return nsel;    
    }

    public static void main(String[] args) {
        int[] arr= {7,8,5,6,3,4,1,2};
        display(NGEL_no(arr));
        System.out.println();
        display(NGER_no(arr));
        System.out.println();
        display(NSER_no(arr));
        System.out.println();
        display(NSEL_no(arr));
    }
    
}
