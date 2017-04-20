/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Mauna Kea
 */
public class Perimeter_of_squares {
    public static BigInteger perimeter(BigInteger n) {
        ArrayList<BigInteger> cuadrados=new ArrayList<>();
        cuadrados.add(BigInteger.ONE);
        cuadrados.add(BigInteger.ONE);
        BigInteger solucion=BigInteger.valueOf(2);
        for(int i=2;i<n.intValue()+1;i++){
            cuadrados.add(cuadrados.get(i-1).add(cuadrados.get(i-2)));
            solucion=solucion.add(cuadrados.get(i));
        }
        return solucion.multiply(BigInteger.valueOf(4));
	}
}
