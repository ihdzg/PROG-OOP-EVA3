/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try_catcheva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA3_5_TRY_CATCHEVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el nominador");
        int num = input.nextInt();
        
        System.out.println("Introduce el divisor");
        int divi = input.nextInt();
        
        int resu = 0;
        resu = num / divi;
        
        System.out.println("Resultado: " + resu);
        
        }catch (InputMismatchException e) {
            e.printStackTrace();
            
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        System.out.println("Fin del programa :))");
    }
    
}

