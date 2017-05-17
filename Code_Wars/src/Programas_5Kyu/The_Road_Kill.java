/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_5Kyu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class The_Road_Kill {
    public static String roadKill(final String photo) {
        String fotoProcesada=photo.replaceAll("=", "");
        StringBuilder animalSimple=new StringBuilder();
        char[] letras=fotoProcesada.toCharArray();
        String elim1="";
       for(int i=letras.length-1;i>0;i--){
           if(letras[i]==letras[i-1])elim1=elim1+letras[i];
           else animalSimple.append(letras[i]);
       }
       animalSimple.append(letras[0]);
        ArrayList<String> animales=new ArrayList<>(Arrays.asList(
                "aardvark", "alligator", "armadillo", "antelope", "baboon", "bear",
                "bobcat", "chameleon","giraffe", "gibbon", "gecko", "hyena",
                "hippopotamus", "horse", "hamster", "insect", "impala", "iguana",
                "ibis", "squirrel", "sheep", "turtle", "tiger", "unicorn", "yak", "zebra"));
        for(String anim:animales){
        String animal="";
        String elim2="";
            char[] an=anim.toCharArray();
            for(int i=an.length-1;i>0;i--){
           if(an[i]==an[i-1])elim2=elim2+an[i];
           else animal=an[i]+animal;
       }
            animal=an[0]+animal;
            if((animal.equalsIgnoreCase(animalSimple.toString())||animal.equalsIgnoreCase(animalSimple.reverse().toString()))&&elim1.contains(elim2))return anim;
        }
    return "??";
  }
}
