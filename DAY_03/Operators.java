public class Operators{
    public static void main(String[] args) {

        //Arithmetic Operators = Arithmetic operators are used to perform common mathematical operations.
        int a = 5;
        int b = 8;
        System.out.println(a+b);                              // Addition
        System.out.println(a-b);                              // Subtraction
        System.out.println(a*b);                              // Mutiplication
        System.out.println(a/b);                              // Division
        System.out.println(a%b);                              // Modulus gives remainder
        System.out.println(++a);                              // Increment then print
        System.out.println(--b);                              // Decrement then print
        System.out.println(b--);                              // print then Decrement cz of colon
        System.out.println(b++ + a);                          // '+' performing operation
        System.out.println(b++ + " " + a++ + a);              // '+' performing concatenation


        //Assignment Operators
        int x;
        System.out.println(x = 5);                               
        System.out.println(x += 3);
        System.out.println(x -= 3);
        System.out.println(x *= 3);
        System.out.println(x /= 3);
        System.out.println(x %= 3);
        System.out.println(x &= 3);
        System.out.println(x |= 3);
        System.out.println(x ^= 3);
        System.out.println(x >>= 3);
        System.out.println(x <<= 3);


        // Bitwise Operators
        // 1)Bitwise OR (|)
        // 2)Bitwise AND (&)
        // 3)Bitwise XOR (^) 
        // 4)Bitwise Complement (~)
        // 5)Bitwise left shift(<<)
        // 6)Bitwise right shift(>>)


        //Comparison Operators
        int y = 6;
        System.out.println(x == y);                               // Equal to
        System.out.println(x != y);                               // Not equal
        System.out.println(x > y);                                // Greater than
        System.out.println(x < y);                                // Less than
        System.out.println(x >= y);                               // Greater than or equal to
        System.out.println(x <= y);                               // Less than or equal to


        //Logical Operators
        System.out.println(x < 5 &&  x < 10);                        // Logical "and (&&)" Returns true if both statements are true
        System.out.println(x < 5 || x < 6	);                       // Logical "or (||)" Returns true if one of the statements is true
        System.out.println(!(x < 5 && x < 10));                      // Logical "not (!)" Reverse the result, returns false if the result is true

    }
}    
