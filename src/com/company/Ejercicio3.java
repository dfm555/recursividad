package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio3 {
    public static int ejercicio3( int n ){
        System.out.println( n );
        if( n > 1 ){
            return ejercicio3(n-1);
        }
        return n;
    }
}
