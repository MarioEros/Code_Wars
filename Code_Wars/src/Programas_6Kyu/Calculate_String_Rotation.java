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
public class Calculate_String_Rotation {

    public static int shiftedDiff(String first, String second) {
        if (first.length() != second.length())return -1;
        int rotation = 0;
        rotation = second.indexOf(first.charAt(0));
        if (rotation < 0)return -1;
        while (rotation<=first.length()){
            if(second.equalsIgnoreCase(first.substring(first.length()-rotation)+first.substring(0,first.length()-rotation)))return rotation;
            rotation++;
        }
        return -1;
  }
}
