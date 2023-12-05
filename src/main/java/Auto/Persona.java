package Auto;

import java.util.ArrayList;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private ArrayList<CorreoElectronico> correos;
    private ArrayList<Automovil> automoviles;

    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correos = new ArrayList<>();
        this.automoviles = new ArrayList<>();
    }

    // Getters
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<CorreoElectronico> getCorreos() {
        return correos;
    }

    public ArrayList<Automovil> getAutomoviles() {
        return automoviles;
    }

    // Setters
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreos(ArrayList<CorreoElectronico> correos) {
        this.correos = correos;
    }

    public void setAutomoviles(ArrayList<Automovil> automoviles) {
        this.automoviles = automoviles;
    }
}
