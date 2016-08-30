package com.company;

/**
 * Created by monicaramirez on 30/08/16.
 */
public class Ejercicio27 {
    public static float ejercicio27(int n, int i){
        if(i < n){
            return i*i+ejercicio27(n, i+1);
        }
        return i*i;
    }
}
