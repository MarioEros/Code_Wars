/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Programas_3Kyu.Battleship_field_validator;
import Programas_3Kyu.Calculator;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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
            if (prueba.equalsIgnoreCase("fin")) {
                break;
            }
            //String caso= "pepe\npaco";
            //String[] dividido = prueba.split(" ");
//            double uno=Double.parseDouble(dividido[0]);
//            double dos=Double.parseDouble(dividido[1]);
//            double numdouble=Double.parseDouble(prueba);
//            float numfloat=Float.parseFloat(prueba);
//            byte numbyte=Byte.parseByte(prueba);
//            short numshort=Short.parseShort(prueba);
//            int numint=Integer.parseInt(prueba);
//            long numlong=Long.parseLong(prueba);
            int[][] matrix = {
                {1, 1, 1, 1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
//            String uno=Arrays.toString(matrix[0])
//                    +matrix[1][matrix.length-1]+matrix[2][matrix.length-1]
//                    +Arrays.toString(matrix[matrix.length-1])
//                    +matrix[1][0]+matrix[2][0];
            //System.out.println(caso);
            //System.out.println(dividido[0]+" "+dividido[1]);
            System.out.println(Battleship_field_validator.fieldValidator(matrix));
        }
    }

    public static void Tirada() {

        ArrayList<Integer> resultadoDados = new ArrayList<>();
        int dados = 12;
        int caras = 10;
        for (int i = 0; i < dados; i++) {
            resultadoDados.add(Dado(caras) + Dado(caras));
        }
        Collections.sort(resultadoDados);
        for (int res : resultadoDados) {
            System.out.print(res + ",");
        }
        System.out.println();
    }

    public static int Dado(int x) {
        return (int) (Math.random() * x) + 1;
    }

    public static int DadoAcotado(int x, int y) {
        return (int) (Math.random() * (x - y)) + y + 1;
    }
}
