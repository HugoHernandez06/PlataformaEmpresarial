/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

/**
 *
 * @author Administrador
 */
public class Parcial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Matriz[][]= new int [6][6];
        imprimirmatriz(Matriz);
        diagonalprinci(Matriz);
        imprimirmatriz(Matriz);
        datosencimadiagonalprin(Matriz);
        imprimirmatriz(Matriz);
        datosdebajodiagonalprin(Matriz);
        imprimirmatriz(Matriz);
        diagonalsecund(Matriz);
        imprimirmatriz(Matriz);
    }
    
    public static void imprimirmatriz(int Matriz[][]){
        for(int i = 0; i < Matriz[0].length ; i++){
            for(int j = 0; j < Matriz.length ; j++){
                System.out.print(Matriz[i][j] + "|");
            }
            System.out.println("");
        }  
    }
    
    public static void diagonalprinci(int Matriz[][]){         
        for(int i = 0 ; i < Matriz.length; i++){         
            for(int j = 0 ; j < Matriz.length ; j++){
                if(i == j){
                   Matriz[i][j] = 1;
                }
            }
        }            
    }
    
    public static void datosencimadiagonalprin(int Matriz[][]){
         for(int i = 0; i < Matriz.length - 1; i++){
            for(int j = i+1; j < Matriz.length; j++){
                Matriz[i][j] = 5;
            }
        }       
    }
    
    public static void datosdebajodiagonalprin(int Matriz[][]){
        for(int i = Matriz.length - 1; i >= 1; i--){
            for(int j = i-1; j >= 0; j--){
                Matriz[i][j] = 3;
            }
        }                   
    }
    
    public static void diagonalsecund(int Matriz[][]){
        for(int i = 0; i < Matriz.length ; i ++){
            for(int j = 0; j < Matriz.length; j++){
                if( i+j == Matriz.length - 1){
                    Matriz[i][j] = 7;
                }
            }
        }
    }  
   
}
