/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_7kyu;

/**
 *
 * @author Mauna Kea
 */
public class Resistor_Color_Codes {
    public static String decodeResistorColors(String bands) {
        String solucion="";
        if(bands.endsWith("gold")){
            solucion="5%";
            bands=bands.substring(0, bands.length()-5);
        }
        else if(bands.endsWith("silver")){
            solucion="10%";
            bands=bands.substring(0, bands.length()-7);
        }
        else solucion="20%";
       String[] colores=bands.split(" ");
       String valores;
       for(String valor:colores){
           switch(valor){
               case blue:           
           }
       }
       return solucion;
    }
}
