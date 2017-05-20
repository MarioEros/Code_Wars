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
public class The_Hunger_Games {
    public static String hungryFoxes(final String farm) {
        String[] granja=farm.split("\\[[C.F]*\\]");
        String sacaJaulas="]"+farm+"[";
        String[] jaulas=sacaJaulas.split("\\][C.F]*\\[");
        //Comprobamos si hay un zorro fuera
        boolean zorroFuera=false;
        for(String zorro:granja)if(zorro.contains("F"))zorroFuera=true;
        //Si hay un zorro fuera se come las gallinas
        for(int i=0;i<granja.length;i++)if(zorroFuera)granja[i]=granja[i].replace("C", ".");
        for(int i=0;i<jaulas.length;i++)if(jaulas[i].contains("F"))jaulas[i]=jaulas[i].replace("C", ".");
//        System.out.println(granja[0]+granja[1]+granja[2]+granja[3]);
//        System.out.println(jaulas[1]+jaulas[2]+jaulas[3]);
//        System.out.println(granja.length+" "+jaulas.length);
        String devolver="";
        int mayor=Math.max(granja.length, jaulas.length);
        for(int i=0;i<mayor;i++)devolver=devolver+"["+(jaulas.length>i?jaulas[i]:jaulas==null?"[]":"")+"]"+(granja.length>i?granja[i]:"");
    return devolver.substring(2);
  }
}
