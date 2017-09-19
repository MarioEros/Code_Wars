/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_6Kyu;

import java.util.ArrayList;

/**
 *
 * @author Eros
 */
public class C_Find_the_odd_int {
    public static int find_it(int[] seq)
    {
        ArrayList<Integer> numeros = new ArrayList();
        while (numeros.le > 1)
        {
            if (numeros.IndexOf(numeros[0], 1) != -1)
            {
                numeros.Remove(numeros.IndexOf(numeros[0], 1));
                numeros.Remove(0);
            }
            else return (int)numeros[0];
        }
        return 0;
    }
}
