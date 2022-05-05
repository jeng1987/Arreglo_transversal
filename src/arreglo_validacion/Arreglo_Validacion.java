/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_validacion;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 *
 * @author JENG-PC
 */
public class Arreglo_Validacion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       int acum = 0;
       int fila,columna;
       System.out.print("Digite la canitdad de filas");
       fila = leer.nextInt();       
       System.out.print("Digite la canitdad de columnas");
       columna = leer.nextInt();       
       Integer[][] arreglo = new Integer[fila][columna];
       for(int i=0;i<fila;i++){
           for(int j=0;j<columna;j++){
               System.out.print("Digite el valor de la posicion fila:"+i+" "+"Columna: "+j+" ");
               arreglo[i][j]=leer.nextInt();
           }
       }       
         for(int i=0;i<fila;i++){
           for(int j=0;j<columna;j++){
              if(i==j){
                  acum = acum + arreglo[i][j];                  
              }
               }           
       }
         System.out.print("\nEl resultado de la suma de la diagonal es: "+acum);
    }

    
    
}
