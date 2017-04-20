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
public class Stop_gninnipS {
    public static String spinWords(String sentence) {
        String[] palabras=sentence.split(" ");
        String respuesta="";
        for (String word:palabras){
            if(word.length()>4){
                word = new StringBuilder(word).reverse().toString();
            }
            respuesta=respuesta+" "+word;
        }
        return respuesta.substring(1);
  }
}
