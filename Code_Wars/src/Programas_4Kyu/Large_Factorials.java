/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.math.BigInteger;

/**
 *
 * @author Mauna Kea
 */
public class Large_Factorials {
    public static String Factorial(int n) {
        if(n==0)return "0";
        if(n<0)return null;
        BigInteger solucion=BigInteger.ONE;
        for (long i=1;i<=n;i++){
            solucion=solucion.multiply(BigInteger.valueOf(i));
        }
        return solucion.toString();
  }
}
