/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner captu = new Scanner(System.in);
            System.out.println("Introduce un numero entero: ");
            int nume = captu.nextInt();
            System.out.println("El valor3 capturado fue: " + nume);
        }catch(InputMismatchException E){
            System.out.println("El valor introducido es un numero entero");
        }finally{
            System.out.println("ESTA INTSRUCCION SIEMPRE SE VA A EJECUTAR");
        }
                    
    }
    
}
 