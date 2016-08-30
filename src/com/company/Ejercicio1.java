package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio1 {
    public static int ejercicio1( int a, int b ){

        if( a < b ){
            System.out.println(a);
            int sum = ejercicio1(a+1, b);
            return sum;
        }
        return a;
    }
}

