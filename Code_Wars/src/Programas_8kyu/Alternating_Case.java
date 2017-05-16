/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_8kyu;

/**
 *
 * @author Mauna Kea
 */
public class Alternating_Case {
    public static String toAlternativeString(String string) {
        StringBuilder devolver=new StringBuilder();
        for(String letra:string.split("")){
            if (letra.charAt(0)>95&&letra.charAt(0)<123)devolver.append((char)(letra.charAt(0)-32));
            else if (letra.charAt(0)>64&&letra.charAt(0)<91)devolver.append((char)(letra.charAt(0)+32));
            else devolver.append(letra);
        }
    return devolver.toString();
  }
}
