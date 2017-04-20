package Programas_6Kyu;

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
public class Tribonacci_Sequence {
    public static double[] tribonacci(double[] s, int n) {
        ArrayList<Double> secuencia=new ArrayList();
        secuencia.add(s[0]);
        secuencia.add(s[1]);
        secuencia.add(s[2]);
        double[] respuesta=new double[1];
        if (n==0)return respuesta;
        respuesta=new double[n];
        for(int i=0;i<respuesta.length;i++){
            if(i<3){
                respuesta[i]=secuencia.get(i);
            }else{
                respuesta[i]=secuencia.get(i)+secuencia.get(i+1)+secuencia.get(i+2);
            }
            secuencia.add(respuesta[i]);
        }
        return respuesta;
  }
}
