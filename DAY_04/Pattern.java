package DAY_04;
import java.util.Scanner;
public class Pattern{

    static void printSquare(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printRFT(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
            System.out.print("* ");
         System.out.println();
         }
    }

    static void printIRFT(int n) {
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printLFT(int n){
        for(int i = 1; i <= n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();    
        }
    }

    static void printILFD(int n){
        for (int i=n; i>=1; i--){
            for(int k=(n-i); k>=1; k-- )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printQ_6(int n) {
        for (int i=n; i>=1; i--){
            for(int k=2*(n-i); k>=1; k-- )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printHollow_sq(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }


    static void printDigonal(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i==j || j==n-i+1)
                   System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }


    static void printTriangle(int n) {
        for (int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++ )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            for(int j=2; j<=i; j++)
                System.out.print("* ");    
            System.out.println();
        }
    }

    static void printInver_TRI(int n) {
        for (int i=n; i>=1; i--){
            for(int k=(n-i); k>=1; k-- )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            for(int j=2; j<=i; j++)
                System.out.print("* ");    
            System.out.println();
        }
    }

    static void printQ_11(int n) {
        for (int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++ )
                System.out.print("  ");
            for(int j=1; j<=i; j++){
                if(j%2==0)
                System.out.print("  ");
                else
                System.out.print("* "); 
            }
            for (int j=2; j<=i; j++){
                if (i%2==0&&j%2!=0) {
                    System.out.print("  ");                    
                }
                else if (i%2!=0&&j%2==0) {
                    System.out.print("  ");                   
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printQ_12(int n) {
        for (int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++ )
                System.out.print("  ");
            for(int j=1; j<=i; j++){
                if(j%2==0)
                System.out.print("! ");
                else
                System.out.print("* "); 
            }
            for (int j=2; j<=i; j++){
                if (i%2==0&&j%2!=0) {
                    System.out.print("! ");                    
                }
                else if (i%2!=0&&j%2==0) {
                    System.out.print("! ");                   
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printLeft_TRI(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int k=n; k>=1; k--){
            for(int j=2; j<=k; j++)
                System.out.print("* ");
            System.out.println(); 
        }
    }



    static void printRyt_TRI(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
               System.out.print("* ");
            System.out.println();
        }
        for (int i=(n-1); i>=1; i--){
            for(int k=(n-i); k>=1; k-- )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printQ_15(int n) {
        for(int i=n; i>=1; i--){
            for(int k=2*(n-i); k>=1; k--)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int k=1; k<=2*(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printQ_16(int n) {
        for(int i=n; i>=1; i--){
            for(int k=1; k>=(n-i-2); k--)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int k=(n-i-1); k<=i; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printQ_21(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(i); j++)
                System.out.print("* ");
            for(int k=(n-i); k>=1; k--)
                System.out.print("  ");
            for(int k=(n-i); k>=2; k--)
                System.out.print("  ");
            for(int j=1; j<=i && j<=n-1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printQ_22(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(i); j++)
                System.out.print("* ");
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int k=2; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i  && j<=n-1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printQ_23(int n) {
        for (int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++ )
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print("1 ");
            for(int j=2; j<=i; j++)
                System.out.print("1 ");    
            System.out.println();
        }
    }


    static void printQ_24(int n) {
        for (int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++ )
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(i);
            for(int j=2; j<=i; j++)
                System.out.print(i);    
            System.out.println();
        }
    }


    static void printQ_25(int n) {
        int a=1;
            for(int i = 1; i <= n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=(i*2)-1; j++)
                System.out.print(a++ +" ");
            System.out.println();  
             
        }
    }


    static void printQ_26(int n) {
        for(int i=1; i<=n; i++){
            for(int j=n;j>=1;j--){
                if(j==i)
                System.out.print("* ");
            else
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void printQ_27(int n) {
        for(int i = 1; i <= n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(j);
            for (int j=i-1; j>=1; j--)
                System.out.print(j);
         System.out.println();
        }
    }

    static void printQ_28(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            int a=i;
            for(int j=2; j<=i; j++){
                System.out.print(a +" ");
                a++;}
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a--;}
            System.out.println();
        }
    }

    static void printQ_29(int n) {
        for(int i = 1; i <= n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i; j++){
                if(j==1){
               System.out.print(i + " ");}
                else
                System.out.print("0 ");
            }
            for(int j=2; j<=i; j++){
                if (i!=j) {
                    System.out.print("0 ");
                }
                else
                System.out.print(i + " ");
            }
            System.out.println();    
        }
    }


    static void printQ_30(int n) {
        for(int i=1; i<=n; i++){
            for(int j=n;j>=1;j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }


    static void printQ_31(int n) {
        for(int i=1; i<=n; i++){
            for(int j=n;j>=1;j--){
                if(j==i)
                System.out.print("* ");
                else
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void printQ_32(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j!=i)
                System.out.print("*");}
            System.out.println();
        }
        for(int a=n-1; a>=1; a--){
            for(int j=a; j>=1; j--){
                System.out.print(a);
                if (j!=1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void printQ_33(int n) {
        for(int i=1; i<=n; i++){
            for(int k=(n-i); k>=1; k--)
                System.out.print("  ");
            for(int j=(n-i)+1; j<n; j++)
                System.out.print(j + " ");
            for(int j=n; j>(n-i); j--){
                if (j==n) {
                    System.out.print("0 ");
                }
                else
                System.out.print(j + " ");}
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        //printSquare(n);
        //printRFT(n);
        //printIRFT(n);
        //printLFT(n);
        //printILFD(n);
        //printQ_6(n);
        //printHollow_sq(n);
        //printDigonal(n);
        //printTriangle(n);
        //printInver_TRI(n);
        //printQ_11(n);
        //printQ_12(n);
        //printLeft_TRI(n);
        //printRyt_TRI(n);
        printQ_15(n);
        //printQ_16(n);
        //printQ_21(n);
        //printQ_22(n);
        //printQ_23(n);
        //printQ_24(n);
        //printQ_25(n);
        //printQ_26(n);
        //printQ_27(n);
        //printQ_28(n);
        //printQ_29(n);       
        //printQ_30(n);
        //printQ_31(n);
        //printQ_32(n);
        //printQ_33(n);
        sc.close();
    }
}