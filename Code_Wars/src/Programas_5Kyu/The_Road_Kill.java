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
public class The_Road_Kill {
    public static String roadKill(final String photo) {
        String fotoProcesada=photo.replaceAll("=", "");
        String animalSimple="";
        char[] letras=fotoProcesada.toCharArray();
       for(int i=letras.length-1;i>1;i--){
           animalSimple+=letras[i]==letras[i-1]?"":letras[i];
       }
    
    return animalSimple;
  }
}
