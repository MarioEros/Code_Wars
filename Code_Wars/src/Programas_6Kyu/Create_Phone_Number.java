/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

/**
 *
 * @author Mauna Kea
 */
public class Create_Phone_Number {
    public static String createPhoneNumber(int[] numbers) {
    return "("+numbers[0]+numbers[1]+numbers[2]
            +") "+numbers[3]+numbers[4]+numbers[5]
            +"-"+numbers[6]+numbers[7]+numbers[8]+numbers[9];
  }
}
