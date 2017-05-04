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
public class Range_Extraction {
    public static String rangeExtraction(int[] arr) {
        String solucion="";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-2&&arr[i]+1==arr[i+1]&&arr[i]+2==arr[i+2]){
                solucion=solucion+","+arr[i]+"-";
                i+=2;
                while(i<arr.length-1&&arr[i]+1==arr[i+1])i++;
                solucion=solucion+arr[i];
            }else solucion=solucion+","+arr[i];
        }
        return solucion.substring(1);
    }
}
