package DAY_05;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] arr= new int[5];         //declare and initialize both
        //int [] ar;                       //only declaration
        //ar=new int[12];                   // only initialization
        System.out.println(arr[4]);         //o/p '0' by default
        arr[1]=10;
        arr[0]=64;
        arr[2]=20;
        arr[3]=54;
        arr[4]=19;
        System.out.println(arr);        //o/p print address
        System.out.println(arr[4]);
        int[] arr1= {10,25,48,76,49};
        System.out.println(arr1[3]);
        System.out.println(arr1.length);


        

        // HOW TO TAKE INPUT FROM USER
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]);
        }
        sc.close();
    }
}
