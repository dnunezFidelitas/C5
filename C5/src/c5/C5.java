/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c5;

/**
 *
 * @author viti
 */
public class C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        multiplicarAyB(20, 55);
        
        multiplicarAyB(21, 60);
        
        multiplicarAyB(21, multiplicarAyBConReturn(6, 15));
        
        /*saludar("Juanchis");
        for (int i = 0; i < 10; i++) {
            System.out.println(saludar("Hola", "Miguel"));
        }*/

    }

    public static void saludar(String nombre) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola " + nombre);
        }

    }

    public static String saludar(String parametro1, String parametro2) {
        return parametro1 + " " + parametro2;

    }
    
    
    public static void multiplicarAyB(double a , double b){
        double resultado =0;
        resultado=a * b;
        System.out.println("El valor de la multiplicación es " + resultado);
    
    }
    
    public static double multiplicarAyBConReturn(double a , double b){
        double resultado =0;
        resultado=a * b;
        return resultado;
    }
    
    
    

}
