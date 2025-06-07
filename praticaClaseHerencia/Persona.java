/**
 * Clase que simula a una persona y sus caracteristcas
 * 
 * Nombre: Persona.java *
 * Fecha:29/05/2025 *
 * Objetivo: clase persona
 * 
 * @author Jose Domingo Hernandez Herrera
 * 
 */
public class Persona {
    // Los datos protected pueden ser heredados
    protected String nombre;
    protected String ap_paterno;
    protected String ap_materno;
    protected int edad;

    // public Persona (String nombre, String ap_paterno, String ap_materno, int edad) {
    //     this.nombre = nombre;
    //     this.ap_paterno = ap_paterno;
    //     this.ap_materno = ap_materno;
    //     this.edad = edad;
    // }


    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hablar() {
        System.out.println("Hola!");
    }

    public void caminar() {
        System.out.println("Comienza a caminar.");
    }



}
