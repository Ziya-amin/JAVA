import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int i=0;
        while(0 <= n && n <= 1000000000){
            i = (i*10)+(n%10);
            n=n/10;
        }
        System.out.println(i);
    


        sc.close();
    }
}







// public static void main(String[] args) {
    //     for (int i=0; i<=10; i++){
    //         System.out.println(i);
    //     }
    // }





// public static void main(String[] args) {
//     for (int i=0; i<=10; i++){
//         if (i%2==0){
//             System.out.println(i)
//         }
//     }
// }





// public static void main(String[] args) {
//     int sum=0;
//     int i=1;
//     for (i<=10; i++){
//         sum=sum+i;
//     }
//     System.out.println(sum);
// }




// public static void main(String[] args){
//     for (int i=10; i>=0; i--){
//         System.out.println(i)
//     }
//     // int i=10;
//     while(i>=0){
//         System.out.println(i);
//         i--;
//     }
// }






        // if (0<n) {
        //     for(int i=0,sum=0; i<n; i++){
        //         if (i%2==0) {
        //             sum=+i;
        //             System.out.println(sum);
                    
        //         }
        //     }   
        // }



        // boolean b=true;

        // for(int i=2; 0<n && n<1000000000 && i<n; i++){
        //     if(n%i==0){
        //         b=false;
        //         break;
        //     }
                
        // }
        // if(b==true){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("Not Prime");
        // }