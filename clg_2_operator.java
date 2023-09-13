public class clg_2_operator {
    public static void main(String[] args) {
    // Airthmetic Operator:
        // char c ='a';
        // c++;
        // System.out.println(c);

        // int x =10;
        // int y = ++x + ++x + x++;
        // System.out.println(x+" "+y);

        // byte b = 10;
        // //  b=b+1;                           compiled error
        // // b = 'a'+ 'a';                       value out of range of byte
        // char c ='0';

        // // b = c+'0';                          error so we typecaste this
        // b =(byte)(c+'0');                  
        //  System.out.println(b);

        // double x = 12L +200 - 12.0f/0.0;
        // System.out.println(x);

        // int x = 123/10;
        // System.out.println(x);

        // double x =123/10;
        // double x = 123/10.0;
        
        // float f = 1.6e-19f;                           value in exponential.
        // System.out.println(f);

        // System.out.println(123/0);        zero division error

        // System.out.println(123/0.0);         give Infinity

        // System.out.println(-123/0.0);             give -Infinity

        // System.out.println(0/0);

        // System.out.println(0/0.0);           give not a number(NaN)

        // System.out.println(-0/0.0);          give NaN

    // Logical Operator:
        // System.out.println(true && true);
        // System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(true && 10/0>0);
        // System.out.println(true || 10/0>0);

    //Bitwise Operator:
        //  System.out.println(43 & 53);
        //  System.out.println(43 | 53);
        //  System.out.println(43 ^ 53);
        //  System.out.println(~10);
        //  System.out.println(~-10);
        //  System.out.println(true & true);
        // System.out.println(false & 10/0>0);
        // System.out.println('n' & 'a');

    // String Concatenation:
    //    int x=10, y=20, z=30;
    //    String s ="ISRO";
    //    s= z+10+s+(x+y);
    //    System.out.println(s);

        // System.out.println(12>10);
        // System.out.println(12>10>9);                     error beacuse it read true>9
        // System.out.println(true>false);
        // System.out.println('b'>'a');
        // System.out.println("A">"B");                   error
        // System.out.println(true==false);
        // System.out.println(10.0 == 10);
        // System.out.println('0' == 48);

        // String s1 = "hello";
        // String s2 = "hello";
        // System.out.println(s1 == s2);

        // String s1 = "hello";
        // String s2 ="hello";
        // String s3 = new String("hello");
        // System.out.println(s1==s2);
        // System.out.println(s3);

        // String s = "hello java";                  /* it is in scp */
        // String s1 = "hello ";
        // String s2 = s1+"java";                    /* it is in heap */
        // System.out.println(s2==s);                /* so that's why it give false */
        // System.out.println(s2.equals(s));          /* it check the value of both */

            // boolean a = true;
            // boolean b = false;
            // boolean result = a || b;
            // System.out.println(result);
        
            // int x = 7;
            // int y = 3;
            // System.out.println(x > y ? "x is greater" : "y is greater");

        // int x = 10;
        // int y = x++;
        // System.out.println(y);

    //Left-shift opertor:
        // System.out.println(20<<3);

        // System.out.println(-20>>>2);

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println((int)Character.MAX_VALUE);
        
    }
}
