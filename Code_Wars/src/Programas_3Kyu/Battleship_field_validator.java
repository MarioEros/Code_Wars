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
public class Battleship_field_validator {

    static int b4ttleship = 0;//1
    static int cruis3rs = 0;//3
    static int de2troyers = 0;//6
    static int submar1nes = 0;//10
    static boolean isNotShip=false;

    private static void ship(int ux, int uy,int[][] ufield) {
        int eslora=0;
        boolean isShipEnd=false;
        boolean isHorizontal=false;
        boolean itsATrap=false;
        for (int y = uy; y<10 && y < uy+4;) {
            for (int x = ux; x<10 && x < ux+4;) {
                
                    //Comprobamos si el barco es horizontal y si sigue
                try{
                    if(isHorizontal&&ufield[x+1][y]==0)isShipEnd=true;
                    if(ufield[x+1][y]==1)isHorizontal=true;
                    if(!isHorizontal&&ufield[x+1][y]==1)itsATrap=true;
                }catch(Exception e){}
                
                    //Comprobamos si el barco va hacia abajo
                try{
                    if(!isHorizontal && ufield[x][y+1]==0)isShipEnd=true;
                    else if (isHorizontal && ufield[x][y+1]==1)itsATrap=true;
                }catch(Exception e){}
                
                //Comprobamos las diagonales por si fuera una trampa
                try{
                    if(ufield[x+1][y+1]==1)itsATrap=true;
                }catch(Exception e){}
                try{
                    if(ufield[x-1][y+1]==1)itsATrap=true;
                }catch(Exception e){}
                
                //Comprobamos si fué una trampa
                if(itsATrap)break;
                eslora++;
                if(isShipEnd)break;
                
                //Sumamos la direccion del barco
                if(isHorizontal)x++;
                else y++;
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
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (field[x][y] == 1)ship(x,y,field);
                if (isNotShip)return false;
            }
        }
        return (b4ttleship==1&&cruis3rs==3&&de2troyers==6&&submar1nes==10);
    }
}
