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
public class Tortoise_Racing {
    public static int[] race(int v1, int v2, int g) {
        if(v1<v2){
        float t=0;
        float vv1=v1;
        float vv2=v2;
        float gg=g;
        t=gg/(vv2-vv1);
        t=t*3600;
        int horas=(int)t/3600;
        int min=(int)(t%3600)/60;
        int sec=(int)(t%3600)%60;
        return new int[]{horas,min,sec};
        }
        return null;
    }
}
