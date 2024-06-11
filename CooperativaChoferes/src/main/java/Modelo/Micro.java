
package Modelo;

public class Micro {
    //VARIABLES
    private int idMicro;
    private Chofer chofer;
    private int capacidad;
    private String patente;
    private String modelo;
    private double kilometraje;
    
    //CONSTRUCTORES
    public Micro() {
    }
    public Micro(int idMicro, Chofer chofer, int capacidad, String patente, String modelo, double kilometraje) {
        this.idMicro = idMicro;
        this.chofer = chofer;
        this.capacidad = capacidad;
        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }
    
    //GET Y SET
    public int getIdMicro() {
        return idMicro;
    }

    public void setIdMicro(int idMicro) {
        this.idMicro = idMicro;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    //METODOS


    

   
}
