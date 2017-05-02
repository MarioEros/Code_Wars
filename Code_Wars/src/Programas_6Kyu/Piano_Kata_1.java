/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

import java.util.regex.Pattern;

/**
 *
 * @author Mauna Kea
 */
public class Piano_Kata_1 {
    public static String blackOrWhiteKey(int keyPressCount) {
        while (keyPressCount>88)keyPressCount-=88;
        if (Pattern.matches("6?[0257]|[17][02479]|[28][2469]|3[1468]|4[1368]|5[0358]", Integer.toString(keyPressCount)))return"black";
        return "white";
    }
}
