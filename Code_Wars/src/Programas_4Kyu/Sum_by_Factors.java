/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.math.BigDecimal;

/**
 *
 * @author Mauna Kea
 */
public class Sum_by_Factors {
    public static String sumOfDivided(int[] l) {
        String solucion="";
        int primo=2;
        int suma=0;
        int maximo=0;
        for(int uno:l){
            if (uno>maximo){
                maximo=uno;
            }
        }
        while(primo<maximo) {
            for (int i = 0;i<l.length;i++) {
                if (l[i]%primo==0) {
                    suma = suma + l[i];
                }
            }
            if(suma!=0)solucion += "(" + primo + " " + suma + ")";
            suma=0;
            boolean isPrimo=false;
            while (!isPrimo) {
                primo++;
                for (int i = primo-1; i>1; i--) {
                    if (primo % i == 0) {
                        i=1;
                    }else if (i==2){
                        isPrimo=true;
                    }
                }
            }
        }
    return solucion;
}
  
}
