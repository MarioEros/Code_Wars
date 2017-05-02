/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */caca
public class Piano_Kata_2 {
    public static String whichNote(int keyPressCount) {
        return Arrays.asList(1,4,6,9,11).contains( (keyPressCount-1) % 88 % 12 ) ? "black" : "white";
    }
}
