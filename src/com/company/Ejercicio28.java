package com.company;

/**
 * Created by monicaramirez on 29/08/16.
 */
public class Ejercicio28 {
    public static float sumatoria28(int n, int i, float p) {
        if(i<n){
            return i/p + sumatoria28(n, i+1, 2*p);
        }
        return i/p;
    }
}
