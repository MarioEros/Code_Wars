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
public class Bit_Counting {
    public static int countBits(int n){
        String binario="";
        while(n>0){
            if(n%2==0){
                binario=0+binario;
                n=n/2;
            }else{
                binario=1+binario;
                n=(n-1)/2;
            }
        }
        int num=0;
        for(int i=0;i<binario.length();i++){
            if(binario.charAt(i)=='1')num++;
        }
        return num;
    }
}
