/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_5Kyu;

/**
 *
 * @author Mauna Kea
 */
public class Resistor_Color_Codes_2 {
    public static String encodeResistorColors(String ohmsString) {
        String solucion=" gold";
        ohmsString=ohmsString.substring(0, ohmsString.indexOf(" ohms"));
        int resistencia=0;
        String resi="";
        if(ohmsString.endsWith("M")){
            resistencia=Integer.parseInt(ohmsString.substring(0, ohmsString.length()-1));
            resistencia=resistencia*1000000;
        }else if(ohmsString.endsWith("k")){
            resistencia=Integer.parseInt(ohmsString.substring(0, ohmsString.length()-1));
            resistencia=resistencia*1000;
        }
        resi=
        
        return solucion;
    }
    public static String devuelveValores(int num){
        switch(num){
               case 0: return "black ";
               case 1: return "brown ";
               case 2: return "red ";
               case 3: return "orange ";
               case 4: return "yellow ";
               case 5: return "green ";
               case 6: return "blue ";
               case 7: return "violet ";
               case 8: return "gray ";
               case 9: return "white ";
        }
        return null;
    }
}
