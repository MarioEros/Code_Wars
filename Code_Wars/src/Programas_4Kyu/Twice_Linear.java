/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mauna Kea
 */
streammap
public class Twice_Linear {
    public static int dblLinear (int n) {
        ArrayList<BigInteger> num=new ArrayList<>();
        num.add(BigInteger.ONE);
        for(int i=0;i<=n;i++){
       if(!num.contains(num.get(0).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE)))num.add(num.get(0).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE));
       if(!num.contains(num.get(0).multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)))num.add(num.get(0).multiply(BigInteger.valueOf(3)).add(BigInteger.ONE));
       num.remove(0);
        Collections.sort(num);
        }
        return Integer.parseInt(num.get(0).toString());
    }
}
