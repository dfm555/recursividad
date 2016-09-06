package com.company.Cadenas;

/**
 * Created by duber on 5/09/16.
 */
public class Cadenas {
    public static boolean ejercicio1( String a, String b){
        if (a.length() == b.length()){
            return ejercicio1(a,b,0);
        }

        return false;
    }

    private static boolean ejercicio1(String a, String b, int i){

        if( i < a.length() ){
            if( a.charAt(i) == b.charAt(i) ){
                return ejercicio1(a,b, i+1);
            }
            return false;
        }

        return true;
    }

    public static int ejercicio17( String text ){
        return ejercicio17(text.toLowerCase(), 0, 0, 0, false);
    }

    private static int ejercicio17( String text, int i, int cont, int quantity, boolean flag){

        if(i < text.length()){
            if( (text.charAt(i) == 'a' || text.charAt(i) == 'e'  || text.charAt(i) == 'i'  || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') && !flag ){
                cont++;
            }else{
                cont = 0;
            }

            if (cont == 2){
               flag = true;
            }

            if (flag && ( text.charAt(i) == ' ' || i == text.length() -1 )){
                flag = false;
                quantity++;
            }

            return ejercicio17(text,i+1, cont, quantity, flag);
        }

        return quantity;
    }
}

