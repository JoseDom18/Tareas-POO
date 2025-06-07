public class Profesor extends Persona {
    // public Profesor(String nombre, String ap_paterno, String ap_materno, int edad) {
    //     super(nombre, ap_paterno, ap_materno, edad);
    //     //TODO Auto-generated constructor stub
    // }

    private int tarjeta;
    private String carrera;
    private String especialidad;
    
    public int getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void darClase() {
        System.out.println("Estoy dando clase.");
    }

    public void pasarLista() {
        System.out.println("Pasando lista.");
    }

    @Override
    public String toString() {
        return "Nombre del profesor: " + getNombre() + " " + getAp_paterno() + " " + getAp_materno() + " con numero de tarjeta: " + getTarjeta() + " y carrera : " + getCarrera() + ".";
    }


}
