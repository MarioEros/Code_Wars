/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Programas_5Kyu.The_Road_Kill;
import Programas_6Kyu.The_Hunger_Games;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Mauna Kea
 */
public class Probador {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader("src/Pruebas/datos"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner("datos");
        while (true) {
            String prueba = br.readLine();
            //String prueba = in.nextLine();
            if (prueba.equalsIgnoreCase("fin"))break;
            //String[] dividido = prueba.split(" ");
//            double numdouble=Double.parseDouble(prueba);
//            float numfloat=Float.parseFloat(prueba);
//            byte numbyte=Byte.parseByte(prueba);
//            short numshort=Short.parseShort(prueba);
//            int numint=Integer.parseInt(prueba);
//            long numlong=Long.parseLong(prueba);
//            int[][] matrix = new int[][] { new int[] { 5, 3, 6, 1 },
//                                 new int[] { 5, 8, 7, 4 },
//                                 new int[] { 1, 2, 4, 3 },
//                                 new int[] { 3, 1, 2, 2 } };
//            String uno=Arrays.toString(matrix[0])
//                    +matrix[1][matrix.length-1]+matrix[2][matrix.length-1]
//                    +Arrays.toString(matrix[matrix.length-1])
//                    +matrix[1][0]+matrix[2][0];
            System.out.println(The_Hunger_Games.hungryFoxes(prueba));
        }
    }
}
