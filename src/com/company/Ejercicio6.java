package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio6 {
    public static int ejercicio6(int a, int b){
        if(a < b){
            return a+ejercicio6(a+1, b);
        }
        return a;
    }
}
