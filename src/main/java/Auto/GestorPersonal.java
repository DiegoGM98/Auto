package Auto;

import java.util.ArrayList;

public class GestorPersonal {
    private ArrayList<Persona> personas;

    public GestorPersonal() {
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void agregarAutomovilYCorreo(Persona persona, Automovil automovil, CorreoElectronico correo) {
        persona.getAutomoviles().add(automovil);
        persona.getCorreos().add(correo);
    }

    public ArrayList<Persona> obtenerPersonasPorMarca(String marca) {
        ArrayList<Persona> resultado = new ArrayList<>();
        for (Persona persona : this.personas) {
            for (Automovil auto : persona.getAutomoviles()) {
                if (auto.getMarca().equals(marca)) {
                    resultado.add(persona);
                    break;
                }
            }
        }
        return resultado;
    }

    public ArrayList<Persona> obtenerPersonasPorNombre(String nombre) {
        ArrayList<Persona> resultado = new ArrayList<>();
        for (Persona persona : this.personas) {
            if (persona.getNombre().equals(nombre)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }

    public Persona obtenerPersonaPorRut(String rut) {
        for (Persona persona : this.personas) {
            if (persona.getRut().equals(rut)) {
                return persona;
            }
        }
        return null;
    }
}
