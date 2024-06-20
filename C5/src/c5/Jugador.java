/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5;

import java.util.Date;

/**
 *
 * @author viti
 */
public class Jugador {
    public String nombre;
    public int edad;
    public Date fechaNacimiento;
    public String piernaDominante;
    public String posicion;
    
    public void playGame(){
        System.out.println("El jugador " + nombre + " Esta jugando un partido");
    }
    
    public String getInfoGame(){
        return nombre + " esta jugando ";
    }
    
}
