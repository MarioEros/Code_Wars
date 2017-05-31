/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_5Kyu;

/**
 *
 * @author Mauna Kea
 */
public class Play_Darts {
    public static String getScore(double x, double y){
        int[] cuadrante1={6,13,4,18,1,20};
        int[] cuadrante2={11,14,9,12,5,20};
        int[] cuadrante3={11,8,16,7,19,3};
        int[] cuadrante4={6,10,15,2,17,3};
        double distancia=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println(distancia);
        String devolver="";
        if(distancia<=12.7d)return "DB";
        else if(distancia<=31.8d)return "SB";
        else if(distancia>198d&&distancia<214d)devolver="T";
        else if(distancia>324d&&distancia<340)devolver="D";
        else if(distancia>=340||distancia==198||distancia==214||distancia==324)return "X";
        if (x==0&&y<0)devolver=devolver+3;
        else if (x==0&&y>0)devolver=devolver+20;
        else if (y==0&&x<0)devolver=devolver+11;
        else if (y==0&&x>0)devolver=devolver+6;
        int cuadrante=queCuadrante(x, y);
        int angulo=queAngulo(x, y);
        if(cuadrante==1)devolver=devolver+cuadrante1[angulo];
        if(cuadrante==2)devolver=devolver+cuadrante2[angulo];
        if(cuadrante==3)devolver=devolver+cuadrante3[angulo];
        if(cuadrante==4)devolver=devolver+cuadrante4[angulo];
        return devolver;
    }
    private static int queCuadrante(double x,double y){
        if (x>0&&y>0)return 1;
        else if (x>0&&y<0)return 4;
        else if (x<0&&y>0)return 2;
        else return 3;
    }
    private static int queAngulo(double x,double y){
        double angulo=Math.atan(y/x);
        System.out.println(angulo+" "+Math.tan(1.21));
        if (angulo<9)return 0;
        else if (angulo<27)return 1;
        else if (angulo<45)return 2;
        else if (angulo<63)return 3;
        else if (angulo<81)return 4;
        else return 5;
    }
}
