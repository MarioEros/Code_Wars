/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Programas_3Kyu.Calculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Mauna Kea
 */
public class Probador {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader("src/Pruebas/datos"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String prueba = br.readLine();
            if (prueba.equalsIgnoreCase("fin"))break;
//            String[] dividido = prueba.split(" ");
//            double uno=Double.parseDouble(dividido[0]);
//            double dos=Double.parseDouble(dividido[1]);
//            double numdouble=Double.parseDouble(prueba);
//            float numfloat=Float.parseFloat(prueba);
//            byte numbyte=Byte.parseByte(prueba);
//            short numshort=Short.parseShort(prueba);
            int numint=Integer.parseInt(prueba);
//            long numlong=Long.parseLong(prueba);
//            int[][] matrix = new int[][] { new int[] { 5, 3, 6, 1 },
//                                 new int[] { 5, 8, 7, 4 },
//                                 new int[] { 1, 2, 4, 3 },
//                                 new int[] { 3, 1, 2, 2 } };
//            String uno=Arrays.toString(matrix[0])
//                    +matrix[1][matrix.length-1]+matrix[2][matrix.length-1]
//                    +Arrays.toString(matrix[matrix.length-1])
//                    +matrix[1][0]+matrix[2][0];
            System.out.println(Dire(numint));
        }
    }
}
