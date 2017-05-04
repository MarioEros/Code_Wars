/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_7kyu;

import java.util.List;

/**
 *
 * @author Mauna Kea
 */
public class Ones_And_Zeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binario="";
        for(Integer num:binary){
            binario+=num;
        }
        return Integer.parseInt(binario, 2);
    }
}
