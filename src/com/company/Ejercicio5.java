package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio5 {
    public static int ejercicio5(int a, int b){
        if(a < b){
            System.out.println( a );
            return ejercicio5(a+2, b);
        }
        return a;
    }
}
