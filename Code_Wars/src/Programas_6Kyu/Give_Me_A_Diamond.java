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
public class Give_Me_A_Diamond {
    public static String print(int n) {
        if(n%2==0||n<0)return null;
        String imprimir="";
        String culo=null;
        for(int i=1;i<n;i+=2){
            imprimir=imprimir+espacios(i,n)+diamante(i)+"\n";
            culo=espacios(i,n)+diamante(i)+"\n"+culo;
        }
        imprimir=imprimir+diamante(n)+"\n"+culo.substring(0, culo.length()-4);
        return imprimir;
    }
    public static String espacios(int i,int n){
        String devolver="";
        String espacio=" ";
        for(int e=i;e<n;e+=2)
            devolver=devolver+espacio;
        return devolver;
    }
    public static String diamante(int i){
        String devolver="";
        String diamante="*";
        for(int e=0;e<i;e++)
            devolver=devolver+diamante;
        return devolver;
    }
}
