package com.company;

/**
 * Created by monicaramirez on 1/09/16.
 */
public class Ejercicio31 {
    public static int ejercicio31( int n ){
        return ejercicio31(n, 1);
    }

    private static int ejercicio31(int n, int i){
        if( n > 0 ){
            return i+(i*ejercicio31(n-1, ++i));
        }

        return 0;
    }
}
