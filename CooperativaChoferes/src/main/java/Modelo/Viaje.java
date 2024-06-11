
package Modelo;

public class Viaje {
//VARIABLES
private Socio chofer;
private Colectivo micro;
private double KilometrosRecorridos;
private int pasajeros;

//CONSTRUCTORES
    public Viaje() {
    }
    public Viaje(Socio chofer, Colectivo micro, double KilometrosRecorridos, int pasajeros) {
        this.chofer = chofer;
        this.micro = micro;
        this.KilometrosRecorridos = KilometrosRecorridos;
        this.pasajeros = pasajeros;
    }
    
    //GET Y SET
     public Socio getChofer() {
        return chofer;
    }

    public void setChofer(Socio chofer) {
        this.chofer = chofer;
    }

    public Colectivo getMicro() {
        return micro;
    }

    public void setMicro(Colectivo micro) {
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
