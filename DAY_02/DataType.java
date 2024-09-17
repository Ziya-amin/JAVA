package DAY_02;

public class DataType {
    public static void main(String[] args) {

        // Primitive DataType
        int a= 10;                            //4 bytes, range= -2^31 to (2^31)-1
        boolean b= true;                      //1 bit,   stores only true and false value
        short c= 4;                           //2 bytes, range= -2^15 to (2^15)-1
        long d= 83748;                        //8 bytes, range= -2^63 to (2^63)-1
        float e= 8.74f;                       //4 bytes, shows only six decimal place with round off
        double f= 73.156846515321;            //8 bytes, shows only 15 decimal places
        char g='g';                           //2 bytes, compiler convert char into their ascii value while performing any operation and treat it as integers
        byte h= 76;                           //1 byte,  range= -2^7 to (2^7)-1
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);



        // some operation

        int miniInt= Integer.MIN_VALUE;
        int maxInt= Integer.MAX_VALUE;
        System.out.println(miniInt);
        System.out.println(maxInt);

        short miniSh= Short.MIN_VALUE;
        short maxSh= Short.MAX_VALUE;
        System.out.println(miniSh);
        System.out.println(maxSh);

        long miniLg= Long.MIN_VALUE;
        long maxLg= Long.MAX_VALUE;
        System.out.println(miniLg);
        System.out.println(maxLg);

        byte miniBt= Byte.MIN_VALUE;
        byte maxBt= Byte.MAX_VALUE;
        System.out.println(miniBt);
        System.out.println(maxBt);

        char o= 'o';
        char p= 'p';
        System.out.println(o+1);
        System.out.println(p+2);
        System.out.println(p-o);
    }

}




