/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_8kyu;

/**
 *
 * @author Mauna Kea
 */
public class Rock_Paper_Scissors {
    public static String rps(String p1, String p2) {
        char c1=p1.charAt(0);
        char c2=p2.charAt(0);
        if(c1==c2)return "Draw!";
        else if(c1=='r'&&c2=='s'||c1=='s'&&c2=='p'||c1=='p'&&c2=='r')return "Player 1 won!";
        else return "Player 2 won!";
  }
}
