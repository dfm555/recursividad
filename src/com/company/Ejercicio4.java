package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio4 {
    public static int ejercicio4( int n ){
        if( n > 0 ){
            int order = ejercicio4(n-1);
            System.out.println( n );
            return order;
        }
        return n;
    }
}
