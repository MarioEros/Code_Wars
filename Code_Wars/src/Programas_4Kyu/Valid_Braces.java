/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class Valid_Braces {
    public static boolean isValid(String braces) {
        ArrayList<String> parentesis=new ArrayList<>(Arrays.asList(braces.split("")));
        boolean isBorrado=true;
        while(isBorrado){
            isBorrado=false;
            for(int i=parentesis.size()-1;i>0;i--){
                if(parentesis.get(i).equalsIgnoreCase(")")&&
                        parentesis.get(i-1).equalsIgnoreCase("(")){
                    isBorrado=true;
                    parentesis.remove(i);
                    parentesis.remove(i-1);
                    break;
                }
                if(parentesis.get(i).equalsIgnoreCase("]")&&
                        parentesis.get(i-1).equalsIgnoreCase("[")){
                    isBorrado=true;
                    parentesis.remove(i);
                    parentesis.remove(i-1);
                    break;
                }
                if(parentesis.get(i).equalsIgnoreCase("}")&&
                        parentesis.get(i-1).equalsIgnoreCase("{")){
                    isBorrado=true;
                    parentesis.remove(i);
                    parentesis.remove(i-1);
                    break;
                }
            }
        }
        if(parentesis.isEmpty())return true;
        return false;
  }
}
