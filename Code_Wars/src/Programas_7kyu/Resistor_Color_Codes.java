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
        else solucion = "20%";
        String num="";
        String[] colores = bands.split(" ");
        if (colores[1] != null)num = devuelveValores(colores[1]) + num;
        num = devuelveValores(colores[0]) + num;
        float redondear= Float.parseFloat(num)
                *(float)Math.pow(10, 
                        colores[2]==null?
                                Double.parseDouble(devuelveValores(colores[2])):0);
        
        return solucion;
    }
    public static String devuelveValores(String color){
        switch(color){
               case "black": return "0";
               case "brown": return "1";
               case "red": return "2";
               case "orange": return "3";
               case "yellow": return "4";
               case "green": return "5";
               case "blue": return "6";
               case "violet": return "7";
               case "gray": return "8";
               case "white": return "9";
        }
        return null;
    }
}
