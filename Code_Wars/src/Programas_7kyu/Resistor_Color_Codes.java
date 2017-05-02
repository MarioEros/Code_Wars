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
            solucion=" ohms, 5%";
            bands=bands.substring(0, bands.length()-5);
        }
        else if(bands.endsWith("silver")){
            solucion=" ohms, 10%";
            bands=bands.substring(0, bands.length()-7);
        }
        else solucion = " ohms, 20%";
        String resistencia="";
        String[] colores = bands.split(" ");
        if (colores[1] != null)resistencia = devuelveValores(colores[1]);
        resistencia = devuelveValores(colores[0]) + resistencia;
        if (colores[2] != null)resistencia=resistencia+new String("0000000000").substring(0,Integer.parseInt(devuelveValores(colores[2])));
        if (resistencia.length()>6){
            resistencia=resistencia.substring(0, resistencia.length()-5);
            if(resistencia.endsWith("0"))resistencia=resistencia.substring(0, resistencia.length()-1)+"M";
            else resistencia=resistencia.substring(0, resistencia.length()-1)+"."+resistencia.charAt(resistencia.length()-1)+"M";
        }
        else if(resistencia.length()>3){
            resistencia=resistencia.substring(0, resistencia.length()-2);
            if(resistencia.endsWith("0"))resistencia=resistencia.substring(0, resistencia.length()-1)+"k";
            else resistencia=resistencia.substring(0, resistencia.length()-1)+"."+resistencia.charAt(resistencia.length()-1)+"k";
        }
        solucion=resistencia+solucion;
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
