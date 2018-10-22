package kyu_4;

import java.util.ArrayList;

/**
 * Title: 4 By 4 Skyscrapers
 * State: Completed
 */
public class SkyScrapers {
        
        public static TableroSkyScraper sky;
        public static Integer TAMANNO = 4;
        public static int[][] posPistas4 = new int[][]{
            new int[]{0,0},new int[]{0,1},new int[]{0,2},new int[]{0,3},
            new int[]{0,3},new int[]{1,3},new int[]{2,3},new int[]{3,3},
            new int[]{3,3},new int[]{3,2},new int[]{3,1},new int[]{3,0},
            new int[]{3,0},new int[]{2,0},new int[]{1,0},new int[]{0,0}
        };
        public static int[][] posiciones4 = new int[][]{
            new int[]{0,0},new int[]{0,1},new int[]{0,2},new int[]{0,3},
            new int[]{0,3},new int[]{1,3},new int[]{2,3},new int[]{3,3},
            new int[]{3,3},new int[]{3,2},new int[]{3,1},new int[]{3,0},
            new int[]{3,0},new int[]{2,0},new int[]{1,0},new int[]{0,0}
        };
    public static int[][] solvePuzzle(int[] clues) {
        sky = new TableroSkyScraper(4);
        for(int i=0;i<16;i++){
            boolean isVertical      = (i%(TAMANNO*2))<TAMANNO;
            boolean isNormal        = i-(TAMANNO*2)<0;
            sky.primeraVuelta(i,posPistas4[i],clues[i],isVertical,isNormal);
        }
        while(!sky.mapaUnico()){
            for(int i=0;i<16;i++){
            boolean isVertical      = (i%(TAMANNO*2))<TAMANNO;
            boolean isNormal        = i-(TAMANNO*2)<0;
                int clue = clues[i];
                switch(clue){
                    case 3:sky.reglaD3(i, isVertical, isNormal);break;
                    case 2:sky.reglaD2(i, isVertical, isNormal);break;
                }
            }
        }
        return sky.devMap();
    }
}



/**
 * Clase de apoyo para procesar el tablero
 */
class TableroSkyScraper extends ArrayList<ArrayList<ArrayList<Integer>>>{
    private int dimension;
    private ArrayList<ArrayList<Integer>> posibles;
    public static Integer UNO = new Integer(1);
    public static Integer DOS = new Integer(2);
    public static Integer TRES = new Integer(3);
    public static Integer CUATRO = new Integer(4);
    public static Integer CINCO = new Integer(5);
    public static Integer SEIS = new Integer(6);
    /**
     * Creamos el tablero
     * @param dim la dimension de uno de los lados del cuadrado
     */
    public TableroSkyScraper(int dim){
        this.dimension=dim;
        for(int i=0;i<dimension;i++){
            ArrayList<ArrayList<Integer>> fila = new ArrayList<>();//Cada una de las X filas
            for(int j=0;j<dimension;j++){
                ArrayList<Integer> celda = new ArrayList<>();//Cada una de las celdas
                for(int z=1;z<=dimension;z++){
                    celda.add(new Integer(z));
                }
                fila.add(celda);
            }
            this.add(fila);//Fila anadida
        }
    }
    
    /**
     * Devuelve una fila en orden desde el lado recibido
     * @param i el num de fila a devolver
     * @return un Array con las 4 celdas con sus números posibles
     */
    private ArrayList<ArrayList<Integer>> devuelveLinea(int i,boolean isVertical, boolean isNormal){
        if(i<dimension*4&&i>-1){
            int resto = i%(dimension*2);
            ArrayList<ArrayList<Integer>> dev = new ArrayList<>();
            int red = dimension-1;
            for(int j=0;j<dimension;j++){
                if(isNormal){
                    if(isVertical){
                        dev.add(this.get(j).get(resto));
                    }else{
                        dev.add(this.get(resto-dimension).get(red-j));
                    }
                }else{
                    if(isVertical){
                        dev.add(this.get(red-j).get(red-resto));
                    }else{
                        dev.add(this.get(red-(resto%4)).get(j));
                    }
                }
            }
            return dev;
        }else
            System.out.println("Dimension demasiado grande!");
        return null;
    }
    
    public ArrayList<ArrayList<Integer>> getVertical(int y){
        ArrayList<ArrayList<Integer>> col = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            col.add(this.get(i).get(y));
        }
        return col;
    }
    
    public ArrayList<ArrayList<Integer>> getHorizontal(int x){
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            row.add(this.get(x).get(i));
        }
        return row;
    }
    
    public void reducirTablero(){
        for(int x=0;x<dimension;x++){
            for(int y=0;y<dimension;y++){
                reducirLinea(getHorizontal(x));
                reducirLinea(getVertical(y));
            }
        }
    }
    
    private void reducirLinea(ArrayList<ArrayList<Integer>> linea){
        for(ArrayList<Integer> cell:linea)
            if(cell.size()==1)
                linea.stream()
                        .filter(a->!(a.equals(cell)))
                        .forEach(a->a.remove(new Integer(cell.get(0))));
        for(ArrayList<Integer> cell:linea){
            int num;
            num=0;
            for(Integer numero:cell){
                long rep = linea.stream().filter(a->a.contains(numero)).count();
                if(rep==1)num = numero;
            }
            if(num!=0)dejarSolo(cell, num);
        }
    }
    
    /**
     * Metodo que elimina todos los números salvo el especificado de una celda
     * @param cell la celda a la que se aplica
     * @param num el número que se conservará
     */
    private void dejarSolo(ArrayList<Integer> cell, Integer num){
        cell.clear();
        cell.add(new Integer(num));
    }
    
    /**
     * Comprueba si el mapa está terminado
     * @return true si ya está terinado
     */
    public boolean mapaUnico(){
        return !this.stream()
                .anyMatch(a-> a.stream()
                        .anyMatch(b->b.size()!=1));
    }
    
    /**
     * Devuelve el mapa
     * @return un int[][] con las soluciones finales.
     */
    public int[][] devMap(){
        int[][] mapa = new int[dimension][dimension];
        for(int i=0;i<dimension;i++)for(int j=0;j<dimension;j++){
            mapa[i][j]=this.get(i).get(j).get(0);
        }
        return mapa;
    }
    
    //////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////METODOS PARA LA SOLUCION 4X4///////////////////////////
    //////////////////////////////////////////////////////////////////////////////////
    public void primeraVuelta(int x, int[] pos, int clue, boolean isVertical, boolean isNormal){
        posibles = this.devuelveLinea(x,isVertical,isNormal);
        String dir = (isVertical?isNormal?"B":"R":isNormal?"I":"D");
        ArrayList<Integer> cell1 = posibles.get(0);
        ArrayList<Integer> cell2 = posibles.get(1);
        ArrayList<Integer> cell3 = posibles.get(2);
        ArrayList<Integer> cell4 = posibles.get(3);
        switch(clue){
            case 4:{
                dejarSolo(cell1, UNO);
                dejarSolo(cell2, DOS);
                dejarSolo(cell3, TRES);
                dejarSolo(cell4, CUATRO);
            }break;
            case 3:{
                cell1.remove(CUATRO);
                cell1.remove(TRES);
                cell2.remove(CUATRO);
            }break;
            case 2:cell1.remove(CUATRO);break;
            case 1:dejarSolo(cell1, CUATRO);break;
            default:break;
        }
    }

    public void reglaD3(Integer x, boolean isVertical, boolean isNormal) {
        posibles = this.devuelveLinea(x,isVertical,isNormal);
        ArrayList<Integer> cell1 = posibles.get(0);
        ArrayList<Integer> cell2 = posibles.get(1);
        ArrayList<Integer> cell3 = posibles.get(2);
        ArrayList<Integer> cell4 = posibles.get(3);
        if(cell3.size()==1&&cell3.get(0)==4){
            cell2.remove(UNO);
            if(cell2.size()==1&&cell2.get(0)==2){
                dejarSolo(cell1, UNO);
                dejarSolo(cell4, TRES);
            }
            if(cell1.size()==1&&cell1.get(0)==2){
                dejarSolo(cell2, TRES);
                dejarSolo(cell4, UNO);
            }
        }
        if(cell4.size()==1&&cell4.get(0)==4){
            cell2.remove(DOS);
            if(cell2.size()==1&&cell2.get(0)==1){
                dejarSolo(cell1, DOS);
                dejarSolo(cell3, TRES);
            }
            if(cell3.size()==1&&cell3.get(0)==2){
                dejarSolo(cell1, UNO);
                dejarSolo(cell2, TRES);
            }
            if(cell3.size()==1&&cell3.get(0)==3){
                dejarSolo(cell1, DOS);
                dejarSolo(cell2, UNO);
            }
        }
        reducirTablero();
    }

    public void reglaD2(Integer x, boolean isVertical, boolean isNormal) {
        posibles = this.devuelveLinea(x,isVertical,isNormal);
        ArrayList<Integer> cell1 = posibles.get(0);
        ArrayList<Integer> cell2 = posibles.get(1);
        ArrayList<Integer> cell3 = posibles.get(2);
        ArrayList<Integer> cell4 = posibles.get(3);
        if(cell4.size()==1&&cell4.get(0)==4){
            dejarSolo(cell1, TRES);
        }
        if(cell3.size()==1&&cell3.get(0)==4){
            cell1.remove(UNO);
            if(cell2.size()==1&&cell2.get(0)==2)dejarSolo(cell1, TRES);
            if(cell1.size()==1&&cell1.get(0)==2){
                dejarSolo(cell2, UNO);
                dejarSolo(cell4, TRES);
            }
        }
        reducirTablero();
    }
}
