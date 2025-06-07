public class Alumno extends Persona {
    private int matricula;
    private String carrera;
    private int cuatrimestre;
    private String Turno;

 
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getCuatrimestre() {
        return cuatrimestre;
    }
    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    public String getTurno() {
        return Turno;
    }
    public void setTurno(String turno) {
        Turno = turno;
    }

    // Metodos de solucion

    public void reporte() {
        System.out.println("Elaborando reporte.");
    }

    public void tarea() {
        System.out.println("Realizando tarea.");
    }

    @Override
    public String toString() {
        return "Nombre del alumno : " + getNombre() + " " + getAp_materno() + " " + getAp_paterno() + " con numero de matricula: " + getMatricula() + " cursando el cuatrimestre: " + getCuatrimestre() + " en la carrera de " + getCarrera() + "."; 
    }


}
