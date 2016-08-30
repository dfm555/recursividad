package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio2 {
    public static int ejercicio2( int a, int b ){

        if( a < b ){
            int sum = ejercicio2(a+1, b);
            System.out.println(a);
            return sum;
        }
        return a;
    }
}
