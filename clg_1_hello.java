public class clg_1_hello {
    public static void main(String[] args) {
        // byte b = 128;                               give error because range of byte is from -127 to 127.
        byte b = 127;
        short s = 32767;
        int c = 2147483647;
        long d = 2147483648L;
        float f = 10.2f;                             /* BY default float value is Double so that's why we use "f" */
        double g = 12.90;
        char a = '\u1234';
        char k = '\uabcd';
        char z = 48;                                 /* print 0 because 48 it's ascii value */

        char l = 'z';
        int D = (int)l;                          /* print ascii value bye using typecasting. */

        char M ='9';
        int I = (M-48)*10;

        float S = 90.0f;
        // long L = S;                                          error
        long L = (long)S;                                /*Implicit typecasting */


        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(a);
        System.out.println(k);
        System.out.println(z);
        System.out.println(D);
        System.out.println(I);
        System.out.println(L);
    }
}
