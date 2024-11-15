import java.util.Scanner;


public class assig_1_2_3 {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //long n= sc.nextLong();
        // int n1= sc.nextInt();
        // int n2= sc.nextInt();
        int n= sc.nextInt();
        


        // Pattern Numbers & Stars - 2
        while( n>=1 && n<10){
           for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if (j<=i) {
                        System.out.print(j);
                    }
                    else
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
        }


        //Pattern Number Ladder
        // int a=1;
        // while(n>0 && n<100) {
		// 	for(int i=1; i<=n; i++){
		// 		for(int j=1; j<=i; j++){
        //             System.out.print(a + " ");
        //             a++;
		// 		}
        //         System.out.println();
        //     }
        //     break;
		// }




        // Pattern with Zeros
        // while (n>0 && n<100) {
        //     for(int i=1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //             if (j==1 || j==i) {
        //                 System.out.print(i + " ");
        //             }
        //             else
        //             System.out.print("0 ");
        //         }
        //         System.out.println();
        //     }
        //     break;
        // }




        // Pattern Mountain
        // while (n>0 && n<100) {
        //     for(int i=1; i<=n; i++){
        //         for(int j=1; j<n; j++){
        //             if (j<=i) {
        //                 System.out.print(j + " ");                    
        //             }
        //             else
        //             System.out.print("  ");
        //         }
        //         for(int k=(n-i); k>=1; k--)
        //             System.out.print("  ");
        //         for(int j=i; j>=1; j--)
        //             System.out.print(j + " ");
        //         System.out.println();
        //     }
        //     break;
        // }
            
        

        // Manmohan Loves Patterns - I
        // while (n<=1000) {
        //     for(int i=1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //             if(i%2!=0 || j==1 || j==i){
        //                 System.out.print("1");
        //             }
        //             else
        //             System.out.print("0");
        //         }
        //         System.out.println();
        //     }
        //     break;
        // }
        




        // Pattern Numbers & Stars - 1
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n; j++){
        //         if (j<=i) {
        //             System.out.print(j + " ");                    
        //         }
        //         else
        //         System.out.print("* ");
        //     }
        //     for(int j=n-i; j>1; j--)
        //         System.out.print("* ");
        //     System.out.println();
        // }



        //Square pattern
        // for(int i=1; i<=n; i++){
		// 	for(int j=1; j<=n; j++){
        //         if(j<=i) {
        //             System.out.print(i + " ");
        //         }
        //         else
		// 	    System.out.print(j + " ");
        //     }
        //     System.out.println();
		// }


        // Fibonacci Pattern (Pattern 4)
    //     int a=0;
    //     int b=1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(a + " ");
    //             a+=b;}
    //             b=a;
    //             n(n+1)/2;
    //         System.out.println();
    


    // 2ND Assign

    // Hollow Diamond Pattern(Pattern 6)
    // int mid=n/2;
    // int ts=-1;
    // for(int i=1; i<=n; i++){
    //     for(int j=0; j<=mid; j++)
    //         System.out.print("* ");
    //     for(int k=0; k<ts; k++)
    //         System.out.print("  ");
    //     if(i>1 && i<n){
    //         System.out.print("* ");
    //     }
    //     for(int j=1; j<=mid; j++)
    //         System.out.print("* ");
    //     if(i<=n/2){
    //         mid--;
    //         ts+=2;
    //     }
    //     else{
    //         mid++;
    //         ts-=2;
    //     }
    //     System.out.println();
    // }


    //Mirror Star Pattern (Pattern 5)
    // int mid=n/2;
	// int ts=-1;
    // for(int i=0; i<=n; i++){
    //     for(int j=0; j<=mid; j++)
    //         System.out.print("  ");
    //     for(int k=0; k<ts; k++)
    //         System.out.print("* ");
    //     if(i<=n/2){
    //         mid--;
    //         ts+=2;
    //     }
    //     else{
    //         mid++;
    //         ts-=2;
    //     }
    //     System.out.println();
    // }


    // Hollow Rhombus Pattern
    // for(int i=n; i>=1; i--){
    //     for(int k=1; k<=i-1; k++)
    //     System.out.print(" ");
    //     for(int j=n; j>=1; j--){
    //         if(j==1||j==n||i==1||i==n){
    //             System.out.print("*");
    //         }
    //         else
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }



    // daimond
    // for(int i=1; i<=n; i++){
    //     for(int k=1; k<=(n-i); k++)
    //         System.out.print("  ");
    //     for(int j=1; j<=i; j++)
    //        System.out.print(j + " ");
    //     for(int j=2; j<=i; j++)
    //        System.out.print(j + " ");
    //     System.out.println();
    // }
    // for (int i=(n-1); i>=1; i--){
    //     for(int k=(n-i); k>=1; k-- )
    //         System.out.print("  ");
    //     for(int j=1; j<=i; j++)
    //         System.out.print(j + " ");
    //     for(int j=2; j<=i; j++)
    //         System.out.print(j + " ");
    //     System.out.println();
    // }



    // Pattern Double Sided Arrow
//    n=(n+1)/2;
//     for(int i=1; i<=n; i++){
//         for(int k=1; k<=(n-i)*2; k++)
//             System.out.print("  ");
//         for(int j=i; j>=1; j--)
//             System.out.print(j + " ");
//         for(int k=1; k<=(i-1)*2-1; k++)
//             System.out.print("  ");
//         for(int j=1;i>1&& j<=i; j++)
//             System.out.print(j + " ");
//         System.out.println();
//     }
//     for(int i=n-1; i>=1; i--){
//         for(int k=1; k<=(n-i)*2; k++)
//             System.out.print("  ");
//         for(int j=i; j>=1; j--)
//             System.out.print(j + " ");
//         for(int k=1; k<=(i-1)*2-1; k++)
//             System.out.print("  ");
//         for(int j=1;i>1&& j<=i; j++)
//             System.out.print(j + " ");
//         System.out.println();
//     }




    // Pattern Magic
    // for(int i=n; i>=1; i--){
    //     for (int j=1; j<=n-1; j++){
    //         if (j<=i) {
    //             System.out.print("*");       
    //         }
    //         else
    //         System.out.print(" ");
    //     }
    //     for(int k=(n-i); k>=1; k-- )
    //         System.out.print(" ");
    //     for(int j=1; j<=i; j++)
    //         System.out.print("*");
    //     System.out.println();
    // }
    // for(int i=2; i<=n; i++){
    //     for (int j=1; j<=n-1; j++){
    //         if (j<=i) {
    //             System.out.print("*");       
    //         }
    //         else
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=(n-i); k++)
    //         System.out.print(" ");
    //     for(int j=1; j<=i; j++)
    //         System.out.print("*");
    //     System.out.println();
    // }




    // Pattern HourGlass
    // for(int i=n; i>=1; i--){
    //     for(int k=(n-i); k>=1; k-- )
    //         System.out.print("  ");
    //     for(int j=i; j>=0; j--)
    //         System.out.print(j + " ");
    //     for(int j=1; j<=i; j++)
    //         System.out.print(j + " ");
    //     System.out.println();
    // }
    // for(int i=0; i<=n; i++){
    //     for(int k=(n-i); k>=1; k--)
    //         System.out.print("  ");
    //     for(int j=i; j>=1; j--)
    //         System.out.print(j + " ");
    //     for(int j=0; j<=i; j++){
    //         if (j==0) {
    //             System.out.print("0 ");
    //         }
    //         else
    //         System.out.print(j + " ");}
    //     System.out.println();
    // }





    // Downward Triangle Pattern
    // for (int i=n; i>=1; i--){
    //     for(int k=1; k<=(n-i); k++ )
    //         System.out.print("  ");
    //     for(int j=1; j<=i; j++){
    //         if(j%2==0)
    //         System.out.print("  ");
    //         else
    //         System.out.print("* "); 
    //     }
    //     for (int j=2; j<=i; j++){
    //         if (i%2==0&&j%2!=0) {
    //             System.out.print("  ");                    
    //         }
    //         else if (i%2!=0&&j%2==0) {
    //             System.out.print("  ");                   
    //         }
    //         else
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }



    // Pattern Rhombus
    // for(int i=1; i<=n; i++){
    //     for(int k=1; k<=(n-i); k++)
    //         System.out.print("  ");
    //     int a=i;
    //     for(int j=2; j<=i; j++){
    //         System.out.print(a +" ");
    //         a++;}
    //     for(int j=1; j<=i; j++){
    //         System.out.print(a + " ");
    //         a--;}
    //     System.out.println();
    // }
    // for(int i=n-1; i>=1; i--){
    //     for(int k=1; k<=(n-i); k++)
    //         System.out.print("  ");
    //     int a=i;
    //     for(int j=2; j<=i; j++){
    //         System.out.print(a +" ");
    //         a++;}
    //     for(int j=1; j<=i; j++){
    //         System.out.print(a + " ");
    //         a--;}
    //     System.out.println();
    // }



    // Pattern InvertedHourGlass
    // for(int i=n; i>=0; i--){
    //     for(int j=n;j>=i;j--)
    //         System.out.print(j + " ");
    //     for(int k=0; k<=(i-1)*2; k++)
    //         System.out.print("- ");
    //     for(int j=( (i == 0) ? i + 1 : i ); j<=n; j++)
    //        System.out.print(j + " ");
    //     System.out.println();
    // }
    // for(int i=1; i<=n; i++){
    //     for(int j=n;j>=i;j--)
    //         System.out.print(j + " ");
    //     for(int k=0; k<=(i-1)*2; k++)
    //         System.out.print("- ");
    //     for(int j=i; j<=n; j++)
    //        System.out.print(j + " ");
    //     System.out.println();
    // }





    // n=(n+1)/2;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=n; j++){
    //         if(j==1||i==n){
    //             System.out.print("*");
    //         }
    //         else
    //         System.out.print("_");
    //     }
    //     for(int j=n; j<=n*2-1; j++){
    //         if (i==1||j==n) {
    //             System.out.print("*");                
    //         }
    //     }
    //     System.out.println();
    // }
    // for(int i=n; i>=1; i--){
    //     for(int j=1; j<=n; j++){
    //         if (j==n||i==1) {
    //             System.out.print("*"); 
    //         }
    //         else
    //         System.out.print("_");
    //     }
    //     for(int j=1; j<=n; j++){
    //         if (i==n||j==n) {
    //             System.out.print("*");
    //         }
    //         else
    //         System.out.print("_");
    //     }
    //     System.out.println();
    // }



    // int mid=(n+1)/2;
    // for(int i=1; i<=n; i++){
    //     if(i<mid){
    //         for(int j=1; j<=n; j++){
    //             if(j==1||j==mid){
    //                 System.out.print("*");
    //             }
    //             else if (j>mid && i==1) {
    //                 System.out.print("*");
    //             }
    //             else
    //             System.out.print(" ");
    //         }
    //     }
    //     else if (i==mid) {
    //         for(int j=1; j<=n; j++)
    //             System.out.print("*");
    //     }
    //     else{
    //         if(i>mid){
    //             for(int j=1; j<=n; j++){
    //                 if(j==mid||j==n){
    //                     System.out.print("*");
    //                 }
    //                 else if (j<mid && i==n) {
    //                     System.out.print("*");
    //                 }
    //                 else
    //                 System.out.print(" ");
    //             }
    //         }
    //     }
    //     System.out.println();
    // }



    // 3RD Assign
        

        // Sum of odd placed and even placed digits
        // int N = sc.nextInt();
        // int oddSum = 0;
        // int evenSum = 0;
        // int position = 1;
        // while (N > 0) {
        //     int digit = N % 10;
        //     if (position % 2 != 0) {
        //         oddSum += digit;
        //     } else {
        //         evenSum += digit;
        //     }
        //     N /= 10;
        //     position++;
        // }
        
        // System.out.println(oddSum);
        // System.out.println(evenSum);

         
        // Chewbacca and Number
        // long ans=0;
        // long mul=1;
        // while (n>0) {
        //     long digit = n%10;
        //     long temp = digit;
        //     if(temp==9 && (n/10)==0){     
        //     }
        //     else if (temp>=5) {
        //         temp  = 9-digit;             
        //     }
        //     else{
        //         temp = digit;
        //     }
        //     ans += temp*mul;
        //     mul *=10;
        //     n=n/10;
        // }
        // System.out.print(ans);

        
        // Binary To Decimal
        // int ans =0;
        // int mul=1;
        // while (n>0) {
        //     int digit=n%10;
        //     ans += digit*mul;
        //     mul *=2; 
        //     n=n/10;           
        // }
        // System.out.print(ans);


        // LCM
        // int mul=2;
        // int ans=1;
        // while (n1>1 || n2>1) {
        //     if((n1%mul)==0 || (n2%mul)==0) {
        //         if((n1%mul)==0 ){
        //             n1=n1/mul;
        //         }
        //         if((n2%mul)==0){
        //             n2 /=mul;
        //         }
        //         ans *=mul;            
        //     }
        //     else{
        //         mul++;
        //     }
        // }
        // System.out.println(ans);
        

        // Pascal Triangle(Pattern 3)
        // for(int i=0; i<n; i++){
        //     for (int k=0; k < n-i; k++) {
        //         System.out.print("  ");
        //     }
        //     int k=1;
        //     for(int j=0; j<=i; j++){
        //             System.out.print(k + " ");                    
        //             k=k* (i - j) / (j + 1);
        //     }
        //     System.out.println();
        // }

        // GCD
        // if (n1>n2) {
        //     while (n2>0) {
        //         int mod = n1%n2;
        //         n1=n2;
        //         n2= mod;
        //     }
        //     System.out.println(n1);            
        // }
        // else{
        //     while (n1>0) {
        //         int mod = n2%n1;
        //         n2=n1;
        //         n1=mod;                
        //     }
        //     System.out.println(n2);
        // }



    



        sc.close();
    }
}


