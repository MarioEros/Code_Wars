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
public class Find_The_Parity_Outlier {

    static int find(int[] integers) {
        boolean isPar0=integers[0]%2==0;
        boolean isPar1=integers[1]%2==0;
        boolean isPar2=integers[2]%2==0;
        boolean isTodoPares=isPar0&&isPar1||isPar1&&isPar2||isPar0&&isPar2;
        for(int uno:integers){
            if(isTodoPares){
                if(uno%2!=0)return uno;
            }else{
                if(uno%2==0)return uno;
            }
        }
    return 0;
    }
}
