package com.company;

/**
 * Created by monicaramirez on 31/08/16.
 */
public class Ejercicio11 {
    public static int ejercicio11(int n){
        if( n > 0 ){
            return ejercicio11(n-1)*n;
        }
        return 1;
    }
}
