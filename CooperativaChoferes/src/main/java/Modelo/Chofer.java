
package Modelo;

public class Chofer {
    //VARIABLES
    private int id;
    private String nombre;
    private Micro micro;
    private int dni;
    private String licencia;
    
    //CONSTRUCTORES
    public Chofer() {
    }
    public Chofer(int id, String nombre, Micro micro, int dni, String licencia) {
        this.id = id;
        this.nombre = nombre;
        this.micro = micro;
        this.dni = dni;
        this.licencia = licencia;
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

    public Micro getMicro() {
        return micro;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    //METODOS
    
    
    
    
    
    
    
}
