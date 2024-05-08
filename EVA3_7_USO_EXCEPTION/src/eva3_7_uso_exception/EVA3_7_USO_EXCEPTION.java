/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA3_7_USO_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean conseguido = false;
        
         while(!conseguido){
     try {
        
         Scanner input = new Scanner(System.in);
        
         System.out.println("Introduce el NUMERO ENTERO");
        
         int num = input.nextInt();
        conseguido = true;
        
         System.out.println("Fin del programma :))");
        
     }catch (Exception e) {
        }
 
         }
    }
}

