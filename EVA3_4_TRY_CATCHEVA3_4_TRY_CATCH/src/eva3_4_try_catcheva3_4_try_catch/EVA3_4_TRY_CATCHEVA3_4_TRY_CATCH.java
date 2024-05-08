/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_try_catcheva3_4_try_catch;

/**
 *
 * @author ihdzg
 */
public class EVA3_4_TRY_CATCHEVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y = 0;
        int resu = 0;
        
        
        try {
        resu = x / y;
        } 
        catch (ArithmeticException exeption) {//la solucion
        //que queremos hacer
            exeption.printStackTrace();   
        }
        
        System.out.println("Resultado: " + resu);
        
    }
}
