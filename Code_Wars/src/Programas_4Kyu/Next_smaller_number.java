/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class Next_smaller_number {
    public static long nextSmaller(long n){
        String[] numeros=Long.toString(n).split("");
        int[] num=new int[numeros.length];
        for(int e=0;e< numeros.length; e++) {
            num[e] = Integer.parseInt(numeros[e]);
        }
        int cambio = num.length - 2;
        while (num[cambio] >= num[cambio+1]) {
            if (cambio == 0) {
                return -1;
            }
            cambio--;
        }
        int pos=0;
        for (int i=num.length-1;i>cambio;i--){
            if (num[i]>num[cambio]){
                pos=i;
                break;
            }
        }
        int[] numerosAOrdenar=new int[num.length-(cambio+1)];
        int cont=0;
        for (int he = cambio; he < num.length; he++) {
            if (he != pos) {
                numerosAOrdenar[cont] = num[he];
                cont++;
            }
        }
        Arrays.sort(numerosAOrdenar);
        ArrayList<Integer> fina=new ArrayList<>();
        for(int p=0;p<cambio;p++){
            fina.add(num[p]);
        }
        fina.add(num[pos]);
        for(int a:numerosAOrdenar){
            fina.add(a);
        }
        String devolver="";
        for (Integer uno:fina){
            devolver=devolver+uno;
        }
      return Long.parseLong(devolver);
    }
}
