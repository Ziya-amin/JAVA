
import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        //String a= "Hello";      //Declration or intialization   

        //HOW TO TAKE INPUT FROM USER
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();              // just for singal word like from Ziya Amin it'll return only ziya
        // System.out.println("Enter your name : "+ name);
        String namee = sc.nextLine();         // will print whole sentance
        System.out.println("Enter your name : "+ namee);

        //Concatenation
        String firstName = "TONY";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        sc.close();
    }
}
