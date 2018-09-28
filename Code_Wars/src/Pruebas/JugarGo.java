/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Programas_2Kyu.Go;

/**
 *
 * @author A693126
 */
public class JugarGo {
    public static void main(String[] args) throws IOException{
        String leido = null;
        Go juego = new Go(9, 9);
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            leido = br.readLine().toUpperCase();
            if (leido.equals("MATE"))break;
            try{
                if(leido.startsWith("/")){
                    String[] orden = leido.split(" ");
                    switch(orden[0]){
                        case "/RESET":juego.reset();break;
                        case "/PASS":juego.passTurn();break;
                        case "/HANDICAP":
                            juego.handicapStones(Integer.parseInt(orden[1]));break;
                        case "/TURN":juego.getTurn();break;
                        case "/UNDO":juego.rollBack(Integer.parseInt(orden[1]));break;
                        case "/NEW":
                            if(orden.length>2)juego=new Go(Integer.parseInt(orden[1]), Integer.parseInt(orden[2]));
                            else juego=new Go(Integer.parseInt(orden[1]));
                            break;
                        default:System.out.println("Comando no reconocido.");
                    }
                }else juego.move(leido);
            }catch(IllegalArgumentException e){
                System.out.println("No puedes hacer eso!");
            }
        }
    }
}
