/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;


/**
 *
 * @author Mauna Kea
 */
public class Decode_the_morse_code1 {
    public static String decode(String morseCode) {
        String[] palabras=morseCode.trim().split("   ");
        String solucion="";
        for (String una:palabras){
            String[] letras=una.split(" ");
            for(String dos:letras){
                //solucion=solucion+MorseCode.get(dos);
            }
            solucion=solucion+" ";
        }
        return solucion.substring(0, solucion.length()-1);
    }
}
