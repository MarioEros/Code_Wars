/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class Next_smaller_number {
    public static long nextSmaller(long n){
        String[] numeros=Long.toString(n).split("");
        if(numeros.length==1)return -1;
        byte[] num=new byte[numeros.length];
        for(int i=0;i< numeros.length; i++) {
            num[i] = Byte.parseByte(numeros[i]);
        }
        //Cambio guarda el siguiente numero mas grande
        int cambio = num.length - 2;
        while (num[cambio] <= num[cambio+1]) {
            if (cambio == 0) {
                return -1;
            }
            cambio--;
        }
        
        //buscamos el numero mas grande que sea mas pequeño del cambio
        int pos=0;
        byte max=0;
        for(int i=cambio+1;i<num.length;i++){
            if(num[cambio]>num[i]&&num[i]>=max){
                max=num[i];
                pos=i;
            }
        }
        String resultado="";
        for(int i=0;i<cambio;i++)resultado=resultado+num[i];
        resultado=resultado+max;
        int cont=0;
        byte[] numerosAOrdenar=new byte[num.length-(cambio+1)];
        for (int i = cambio; i < num.length; i++) {
            if (i != pos) {
                numerosAOrdenar[cont] = num[i];
                cont++;
            }
        }
        Arrays.sort(numerosAOrdenar);
        for (int i = numerosAOrdenar.length-1; i >= 0;i--)resultado=resultado+numerosAOrdenar[i];
        if(resultado.startsWith("0"))return -1;
      return Long.parseLong(resultado);
    }
}
