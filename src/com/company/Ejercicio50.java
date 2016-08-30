package com.company;

/**
 * Created by monicaramirez on 29/08/16.
 */
public class Ejercicio50 {

    public static float sen( float x, int n ){

        return sen(x,n,x,1,2);
    }

    private static float sen( float x, int n, float num, float den, int i ){
        if (n>=0) {
            return num / den + sen(x, n-1, -num * x *x, den * i *(i+1), i+2);
        }
        return 0;
    }

}
