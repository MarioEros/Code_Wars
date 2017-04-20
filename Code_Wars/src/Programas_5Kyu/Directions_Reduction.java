package Programas_5Kyu;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauna Kea
 */
public class Directions_Reduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<Integer> dirnum = new ArrayList<>();
        for(String uno:arr){
            if(uno.equalsIgnoreCase("NORTH"))dirnum.add(1);
            if(uno.equalsIgnoreCase("SOUTH"))dirnum.add(2);
            if(uno.equalsIgnoreCase("EAST"))dirnum.add(4);
            if(uno.equalsIgnoreCase("WEST"))dirnum.add(5);
        }
        boolean isRepetir=true;
        while (isRepetir) {
            isRepetir=false;
            for (int i=dirnum.size()-1;i>0;i--) {
                if(dirnum.get(i)==dirnum.get(i-1)+1||dirnum.get(i)==dirnum.get(i-1)-1){
                    dirnum.remove(i);
                    dirnum.remove(i-1);
                    i--;
                    isRepetir=true;
                }
            }
        }
        String[] direc=new String[dirnum.size()];
        for(int i=0;i<direc.length;i++){
            if(dirnum.get(i)==1)direc[i]="NORTH";
            if(dirnum.get(i)==2)direc[i]="SOUTH";
            if(dirnum.get(i)==4)direc[i]="EAST";
            if(dirnum.get(i)==5)direc[i]="WEST";
        }
        return direc;
    }
}
