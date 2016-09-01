package com.company;

/**
 * Created by monicaramirez on 31/08/16.
 */
public class Ejercicio26 {
    public static int ejercicio26(int n){
        if( n > 0){
            return ejercicio26(n-1)+n;
        }
        return 0;
    }
}
