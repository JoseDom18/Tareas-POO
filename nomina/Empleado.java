import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase describe a un empleado.
 * 
 * @author Jose Domingo. AKA -> Mingood.
 * @version 1.0
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private int antiguedad;
    private Puesto puesto;
    private int salario;

    public Empleado(String nombre, String apellido, int edad, int antiguedad, Puesto puesto) {

        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        }

        if (antiguedad < 0) {
            throw new IllegalArgumentException("La antiguedad debe ser un entero positivo.");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.puesto = puesto;
        this.salario = 0;
    }

    public int getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    /**
     * Cataloga a la persona en base a su edad.
     */
    public void catalogarEdad() {

        if (this.getEdad() > 49) {
            System.out.printf("%s tiene %d y es una persona muy madura.%n", getNombre(), getEdad());
        } else if (getEdad() > 24) {
            System.out.printf("%s tiene %d y es una persona madura.%n", getNombre(), getEdad());
        } else if (getEdad() > 17) {
            System.out.printf("%s tiene %d y es un adulto.%n", getNombre(), getEdad());
        } else if (getEdad() > 12) {
            System.out.printf("%s tiene %d y es un adolescente.%n", getNombre(), getEdad());
        } else if (getEdad() > 1) {
            System.out.printf("%s tiene %d y es un niño.%n", getNombre(), getEdad());
        } else {
            System.out.printf("%s tiene %d y es un bebe.%n", getNombre(), getEdad());
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Calcula el salario del empleado.
     */
    public void calcularSalario() {

        Map<Integer, Integer> mapa = new HashMap<>();
        mapa.put(1, 500);
        mapa.put(2, 1500);
        mapa.put(3, 5000);

        this.salario += this.puesto.getSalarioBase();
        
        if (antiguedad >= 3) {
            this.salario += mapa.get(3);
        } else {
            this.salario += mapa.get(antiguedad);
        }

        System.out.printf("El empleado: %s %s.%nTiene un salario de: $%d.%n", getNombre(), getApellido(), getSalario());
        
        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

}
