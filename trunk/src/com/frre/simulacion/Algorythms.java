/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.simulacion;

/**
 *
 * @author justo.vargas
 */
public class Algorythms {

    public static long cuadradosMedios(String seed){
        long number = 0;
        try {
            number = Integer.parseInt(seed);
        } catch (NumberFormatException e){
            // wrong number
            number = 00000;
        }
        long result = number*number;
        String boxFinal = String.valueOf(result);
        if (result > 0){
            System.out.println(boxFinal);
            long size = boxFinal.length() - seed.length();
            if (size % 2 != 0){
                boxFinal = "0"+boxFinal;
            }
            int limit = (boxFinal.length()  - seed.length() ) / 2;
            boxFinal = boxFinal.substring(limit, boxFinal.length()-limit);
        } else {
            for (int i = 1; i < seed.length(); i++) {
                boxFinal +="0";
            }
        }
        return Integer.parseInt(boxFinal);
    }

    public static long productosMedios(String seed1, String seed2){
        long number1 = 0;
        long number2 = 0;
        try {
            number1 = Integer.parseInt(seed1);
            number2 = Integer.parseInt(seed2);
        } catch (NumberFormatException e){
            // wrong number
            number1 = 00000;
            number2 = 00000;
        }
        long result = number1*number2;
        String boxFinal = String.valueOf(result);
        if (result > 0){
            System.out.println(boxFinal);
            long size = boxFinal.length() - seed1.length();
            if (size % 2 != 0){
                boxFinal = "0"+boxFinal;
            }
            int limit = (boxFinal.length()  - seed1.length() ) / 2;
            boxFinal = boxFinal.substring(limit, boxFinal.length()-limit);
        } else {
            for (int i = 1; i < seed1.length(); i++) {
                boxFinal +="0";
            }
        }
        return (Integer.parseInt(boxFinal));
    }

}
