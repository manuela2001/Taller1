/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

/**
 *
 * @author Manuela Gomez
 */
public class Casilla {

    public static final String LIBRE = "Libre";
    public static final String BOMBA = "Bomba";
    
    public String estado;

    public Casilla() {
        this.estado = LIBRE;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    }
    

