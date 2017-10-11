/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_3Kyu;

/**
 *
 * @author Eros
 */

Cuenta Erossy no ejecutada.

public class Battleship_field_validator {

    static int b4ttleship = 0;//1
    static int cruis3rs = 0;//3
    static int de2troyers = 0;//6
    static int submar1nes = 0;//10
    static boolean isNotShip=false;

    private static void ship(int uy, int ux,int[][] ufield) {
        int eslora=0;
        boolean isShipEnd=false;
        boolean isVertical=false;
        boolean itsATrap=false;
        for (int x = ux; x<10 && x < ux+4;) {
            for (int y = uy; y<10 && y < uy+4;) {
                
                    //Comprobamos si el barco es horizontal y si sigue
                try{
                    if(isVertical&&ufield[y+1][x]==0)isShipEnd=true;
                    if(ufield[y+1][x]==1)isVertical=true;
                    if(!isVertical&&ufield[y+1][x]==1)itsATrap=true;
                }catch(Exception e){}
                
                    //Comprobamos si el barco va hacia abajo
                try{
                    if(!isVertical && ufield[y][x+1]==0)isShipEnd=true;
                    else if (isVertical && ufield[y][x+1]==1)itsATrap=true;
                }catch(Exception e){}
                
                //Comprobamos las diagonales por si fuera una trampa
                try{
                    if(ufield[y+1][x+1]==1)itsATrap=true;
                }catch(Exception e){}
                try{
                    if(ufield[y-1][x+1]==1)itsATrap=true;
                }catch(Exception e){}
                
                //Comprobamos si fué una trampa
                if(itsATrap)break;
                eslora++;
                if(isShipEnd)break;
                
                //Sumamos la direccion del barco
                if(isVertical)y++;
                else x++;
            }
            //Comprobamos si fué una trampa
                if(itsATrap)break;
                if(isShipEnd)break;
        }
        //Comprobamos si fué una trampa
                if(itsATrap)isNotShip=true;
                
                switch(eslora){
                    case 1:submar1nes++;break;
                    case 2:de2troyers++;break;
                    case 3:cruis3rs++;break;
                    case 4:b4ttleship++;break;
                }
                
    }

    public static boolean fieldValidator(int[][] field) {
        b4ttleship=0;
        cruis3rs=0;
        de2troyers=0;
        submar1nes=0;
        isNotShip=false;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (field[y][x] == 1)ship(y,x,field);
                if (isNotShip)return false;
            }
        }
        return (b4ttleship==1&&cruis3rs==3&&de2troyers==6&&submar1nes==10);
    }
}
