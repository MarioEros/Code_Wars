/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Programas_5Kyu.Rotate_A_Square;
import Programas_7kyu.Resistor_Color_Codes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 *
 * @author Mauna Kea
 */
public class Probador {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String prueba = br.readLine();
            if (prueba.equalsIgnoreCase("fin"))break;
            //int[] ola={0};
            //String[] dividido = prueba.split(" ");
            //long num=Long.parseLong(prueba);
            //String solucion="";
            //int primo=Integer.parseInt(prueba);
            //BigInteger big=BigInteger.valueOf(Long.parseLong(prueba));
           // int num = Integer.parseInt(prueba);
            //int[] arraynum = new int[dividido.length];
            //for (int i = 0; i < arraynum.length; i++) {
            //    arraynum[i] = Integer.parseInt(dividido[i]);}
            //double[] solucion = Tribonacci_Sequence.tribonacci(arraynum, num);
            //for (int e = 0; e < solucion.length; e++) {*/
            /*boolean isPrimo=false;
            while (!isPrimo) {
                primo++;
                for (int i = primo-1; i>1; i--) {
                    if (primo % i == 0) {
                        i=1;
                    }else if (i==2){
                        isPrimo=true;
                    }
                }
            }*/
            /*String[] hola=Directions_Reduction.dirReduc(dividido);
            for(String uno:hola){
                solucion=solucion+" "+uno;
            }*/
            System.out.println(Resistor_Color_Codes.decodeResistorColors(prueba));
            /*System.out.println(Arrays.deepToString(Rotate_A_Square.rotateLikeAVortex(new int[][] { new int[] { 5, 3, 6, 1 },
                new int[] { 5, 8, 7, 4 },
                new int[] { 1, 2, 4, 3 },
                new int[] {3, 1, 2, 2}})));*/
            //}

        }
    }
}
