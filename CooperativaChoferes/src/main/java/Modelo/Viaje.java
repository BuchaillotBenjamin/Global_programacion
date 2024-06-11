
package Modelo;

public class Viaje {
//VARIABLES
private Chofer chofer;
private Micro micro;
private double KilometrosRecorridos;
private int pasajeros;

//CONSTRUCTORES
    public Viaje() {
    }
    public Viaje(Chofer chofer, Micro micro, double KilometrosRecorridos, int pasajeros) {
        this.chofer = chofer;
        this.micro = micro;
        this.KilometrosRecorridos = KilometrosRecorridos;
        this.pasajeros = pasajeros;
    }
    
    //GET Y SET
     public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    public double getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double KilometrosRecorridos) {
        this.KilometrosRecorridos = KilometrosRecorridos;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    //METODOS
    
}
