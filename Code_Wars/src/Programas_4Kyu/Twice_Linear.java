/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Mauna Kea
 */
public class Twice_Linear {
    public static int dblLinear (int n) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
//        Stream<Integer> stNum=num.stream()
//                .map(numero->numero*2+1)
//                .map(numero->numero*3+1)
//                .sorted()
//                .collect(Collectors.toSet());
        for(int i=0;i<=n/2;i++){
        num.add(2*num.get(i)+1);
        num.add(3*num.get(i)+1);
        Collections.sort(num);
        System.out.println("el num "+num.get(i)
                +" da: "+(2*num.get(i)+1)
                +" y "+(3*num.get(i)+1));
        }
        return num.get(n);
    }
}
