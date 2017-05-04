/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Betas;

/**
 *
 * @author Mauna Kea
 */
public class Time_Conversion {
    public static String convertTime(String time){
        String[] hora=time.split(":");
        if(hora[2].endsWith("PM")&&!hora[0].equals("12"))hora[0]=Integer.toString(Integer.parseInt(hora[0])+12);
        if(hora[2].endsWith("AM")&&hora[0].equals("12"))hora[0]="00";
    return (hora[0].equals("24")?"0":hora[0])+":"+hora[1]+":"+hora[2].substring(0, 2);
  }
}
