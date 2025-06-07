public class TestPersona {
    public static void main(String[] args) {
        Profesor  p = new Profesor();
        Alumno a = new Alumno();

        // Asignando datos personales del profesor

        p.setNombre("Hipolito");
        p.setAp_paterno("López");
        p.setAp_materno("Miranda");
        p.setEdad(52);

        // Asignando datos de clase Profesor
        p.setTarjeta(312213);
        p.setCarrera("DSM");
        p.setEspecialidad("DR en sistemas");

        // Asignando datos personales del alumno
        a.setNombre("Jose Domingo");
        a.setAp_paterno("Hernandez");
        a.setAp_materno("Herrera");
        a.setEdad(31);
        
        // Asignando los datos de clase Alumno
        a.setMatricula(422410899);
        a.setCarrera("TSU DSM");
        a.setCuatrimestre(3);
        a.setTurno("matutino");

        // Imprimiendo los datos del profesor

        System.out.println(a);
        System.out.println(p);



    }

}
