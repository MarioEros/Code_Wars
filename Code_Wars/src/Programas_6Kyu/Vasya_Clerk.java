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
public class Vasya_Clerk {

    public String Line(int[] peopleInLine) {
        int caja25 = 0;
        int caja50 = 0;
        for (int persona=0;persona<peopleInLine.length;persona++){
            switch (peopleInLine[persona]) {
                case 25:
                    caja25++;
                    break;
                case 50:
                    caja25--;
                    caja50++;
                    break;
                case 100:
                    if(caja50>0){
                        caja50--;
                        caja25--;
                                }else{
                        caja25=caja25-3;
                    }
                    break;
            }
            if (caja25 < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
