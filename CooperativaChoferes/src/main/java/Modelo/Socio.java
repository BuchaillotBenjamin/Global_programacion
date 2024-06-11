
package Modelo;

import java.util.ArrayList;

public class Socio {
    //VARIABLES
    private int id;
    private String nombre;
    private ArrayList<Colectivo> conduce;
    private int dni;
    private int legajo;
    
    //CONSTRUCTORES
    public Socio() {
    }
    public Socio(int id, String nombre,ArrayList<Colectivo> conduce, int dni, int legajo) {
        this.id = id;
        this.nombre = nombre;
        this.conduce=conduce;
        this.dni = dni;
        this.legajo = legajo;
    }
    
    //GET Y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Colectivo> getConduce() {
        return conduce;
    }

    public void setConduce(ArrayList<Colectivo> conduce) {
        this.conduce = conduce;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    //METODOS
    
    
    
    
    
    
    
}
