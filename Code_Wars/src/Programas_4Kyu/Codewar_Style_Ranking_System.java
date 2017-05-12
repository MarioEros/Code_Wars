/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauna Kea
 */
public class Codewar_Style_Ranking_System {
    public static class User{
        int myRank=-7;
        int myProgress=0;
        public int rank(){
            return myRank<1?myRank-1:myRank;
        }
        
        public int progress(){
            return myProgress;
        }
        public void incProgress(int rank){
            if(rank<0)rank+=1;
            if (rank<-7||rank>8)Logger.getLogger("Error").log(Level.SEVERE, "Rango no valido");
            else{
                if(myRank>rank+1)myProgress+=0;
                else if(myRank==rank+1)myProgress+=1;
                else if(myRank==rank)myProgress+=3;
                else{
                    myProgress+=10*(rank-myProgress)*(rank-myProgress);
                }
            }
            while(myProgress<100){
                myProgress-=100;
                myRank+=1;
            }
        }
    }
}
