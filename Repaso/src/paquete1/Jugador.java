
package paquete1;

import java.io.Serializable;

public class Jugador implements Serializable{
    private String nombre;
    private int dorsal;
    private Club club;
    
    public Jugador(String nom, int d, Club c){
        nombre = nom;
        dorsal = d;
        club = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerDorsal(int n){
        dorsal = n;
    }
    
    public void establecerClub(Club n){
        club = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerDorsal(){
        return dorsal;
    }
    
    public Club obtenerClub(){
        return club;
    }
    
}
