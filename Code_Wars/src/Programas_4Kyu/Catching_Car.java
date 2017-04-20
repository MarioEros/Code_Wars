/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_4Kyu;

/**
 *
 * @author Mauna Kea
 */
public class Catching_Car {
    public static int isInteresting(int number, int[] awesomePhrases) {
        int number2=number+1;
        int number3=number+2;
        for (int uno:awesomePhrases){
            if (uno==number)return 2;
            if (uno==number2||uno==number3)return 1;
        }
        String sNumero1=Integer.toString(number);
        String sNumero2=Integer.toString(number2);
        String sNumero3=Integer.toString(number3);
        String[] numero1=sNumero1.split("");
        String[] numero2=sNumero2.split("");
        String[] numero3=sNumero3.split("");
        if (number2>100){
            String ceros="";
            String num=numero1[0];
            while(ceros.length()+1<sNumero1.length()){
                ceros=ceros+"0";
                num=num+numero1[0];
            }
            int numi=Integer.parseInt(num);
            if(sNumero1.endsWith(ceros))return 2;
            if((double)number/numi==1d)return 2;
            if(sNumero1.equalsIgnoreCase(new StringBuilder(sNumero1).reverse().toString()))return 2;
            boolean incremental1=true;
            boolean incremental2=true;
            boolean incremental3=true;
            boolean decremental1=true;
            boolean decremental2=true;
            boolean decremental3=true;
            for (int i=0;i<numero1.length-1;i++){
                if (Integer.parseInt(numero1[i])+1!=Integer.parseInt(numero1[i+1])&&!(Integer.parseInt(numero1[i])==9&&Integer.parseInt(numero1[i+1])==0)){
                    incremental1=false;
                }
                if (Integer.parseInt(numero2[i])+1!=Integer.parseInt(numero2[i+1])&&!(Integer.parseInt(numero2[i])==9&&Integer.parseInt(numero2[i+1])==0)){
                    incremental2=false;
                }
                if (Integer.parseInt(numero3[i])+1!=Integer.parseInt(numero3[i+1])&&!(Integer.parseInt(numero3[i])==9&&Integer.parseInt(numero3[i+1])==0)){
                    incremental3=false;
                }
            }
            for (int i=numero1.length-1;i>0;i--){
                if (Integer.parseInt(numero1[i])+1!=Integer.parseInt(numero1[i-1])&&!(Integer.parseInt(numero1[i])==9&&Integer.parseInt(numero1[i-1])==0)){
                    decremental1=false;
                }
                if (Integer.parseInt(numero2[i])+1!=Integer.parseInt(numero2[i-1])&&!(Integer.parseInt(numero2[i])==9&&Integer.parseInt(numero2[i-1])==0)){
                    decremental2=false;
                }
                if (Integer.parseInt(numero3[i])+1!=Integer.parseInt(numero3[i-1])&&!(Integer.parseInt(numero3[i])==9&&Integer.parseInt(numero3[i-1])==0)){
                    decremental3=false;
                }
            }
            if(incremental1)return 2;
            if(decremental1)return 2;
            if(incremental2||incremental3)return 1;
            if(decremental2||decremental3)return 1;
            if(sNumero2.endsWith(ceros)||sNumero3.endsWith(ceros))return 1;
            if((float)number2/numi==1f||(float)number3/numi==1f)return 1;
            if(sNumero2.equalsIgnoreCase(new StringBuilder(sNumero2).reverse().toString()))return 1;
            if(sNumero3.equalsIgnoreCase(new StringBuilder(sNumero3).reverse().toString()))return 1;
            for (int uno:awesomePhrases){
            if (uno==number2||uno==number3)return 1;
        }
            
        }else if(number==99)return 1;
        return 0;
  }
}
