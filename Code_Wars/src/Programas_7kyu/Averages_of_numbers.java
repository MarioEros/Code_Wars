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
public class Averages_of_numbers {

    public static double[] averages(int[] numbers) {
        if (numbers.length == 0){
            return null;
        }else if (numbers.length == 1) {
            return new double[]{numbers[0]};
        } else {
            double[] medias = new double[numbers.length - 1];
            for (int i = 0; i < medias.length; i++) {
                medias[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
            }
            return medias;
        }
    }
}
