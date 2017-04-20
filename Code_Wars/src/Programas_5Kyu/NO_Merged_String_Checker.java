/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_5Kyu;

/**
 *
 * @author Mauna Kea
 */
public class NO_Merged_String_Checker {
    public static boolean isMerge(String s, String part1, String part2) {
        if(s.length() != part1.length() + part2.length()) {
            return false;
        } else {
            String[] resultado=s.split("");
            String[] parte1=part1.split("");
            String[] parte2=part2.split("");
            int cont1=0;
            int cont2=0;
            for (String letra : resultado) {
                if (cont1<parte1.length&&letra.contains(parte1[cont1])) {
                    cont1++;
                } else if (cont2<parte2.length&&letra.contains(parte2[cont2])) {
                    cont2++;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
