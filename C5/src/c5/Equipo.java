/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5;

/**
 *
 * @author viti
 */
public class Equipo {
    public Jugador jugadores;
    public String nombreEquipo;
    public String dt;
    public String idDt;
    
    public String darInfoDelEquipo (){
        String resultado ="";
        for (int i = 0; i < 11; i++) {
            resultado = resultado + " " + jugadores.nombre;
        }
        
        return resultado;
    }
    
}
