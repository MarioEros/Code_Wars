/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

import java.util.Arrays;


public class Piano_Kata_2 {
    public static String whichNote(int keyPressCount) {
        return Arrays.asList("A","A#","B","C","C#","D","D#","E","F","F#","G","G#").get((keyPressCount-1) % 88 % 12);
    }
}
