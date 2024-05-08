/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_propagacion_de_exepcioneseva3_3_propagacion_de_exepciones;

/**
 *
 * @author ihdzg
 */
public class EVA3_3_PROPAGACION_DE_EXEPCIONESEVA3_3_PROPAGACION_DE_EXEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        C();
    }
    public static void C(){
        int x = 100, y = 0;
        int resu = x / y;
        System.out.println(resu);
    }
}
