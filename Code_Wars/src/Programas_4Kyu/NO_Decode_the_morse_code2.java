/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;



/**
 *
 * @author Mauna Kea
 */
public class NO_Decode_the_morse_code2 {

    public static String decodeBits(String bits) {
        String tiempo=bits;
        float tempo1 = 0;
        tiempo = tiempo.substring(tiempo.indexOf("1"));
        tempo1 = tiempo.indexOf("0") - tiempo.indexOf("1");
        if(tempo1>0){
            tempo1 = tiempo.length();
        }
        float ratio=1;
        while(true){
            if((tempo1/ratio)==1f||(tempo1/ratio)==3f)break;
            ratio++;
        }
        
        String solucion = "";
        int bit = 0;
        while (bits.length() > 0) {
            if (bits.startsWith("0")) {
                bit = bits.indexOf("1");
                if (bit == -1) {
                    bit = bits.length();
                }
                if (bit/ratio < 3) {
                    bits = bits.substring(bit);
                    solucion = solucion + "";
                } else if (bit > 5 && bit < 14) {
                    bits = bits.substring(bit);
                    solucion = solucion + " ";
                } else if (bit > 13) {
                    bits = bits.substring(bit);
                    solucion = solucion + "   ";
                }
            }else{
                bit = bits.indexOf("0");
                if(bit==-1)bit=bits.length();
                if (bit < 4) {
                    bits = bits.substring(bit);
                    solucion = solucion + ".";
                } else if (bit > 3) {
                    bits = bits.substring(bit);
                    solucion = solucion + "-";
                }
            }
        }
        return solucion;
    }
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
