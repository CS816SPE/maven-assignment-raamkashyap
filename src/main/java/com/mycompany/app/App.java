package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        float a, b;
        a = (float)9.8;
        b = (float)6.5;
        System.out.println( "The input numbers are "+a+" "+b );
        float res = a+b;
        System.out.println( "The sum of the numbers are "+res);
        res = a-b;
        System.out.println( "The difference is "+res);
        res = a*b;
        System.out.println( "The product is "+res);
    }
}
