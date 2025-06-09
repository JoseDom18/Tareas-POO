public class Nomina {
    public static void main(String[] args) {
        
        Empleado jose = new Empleado("Jose", "Hernandez", 31, 1, Puesto.Obrero);

        jose.catalogarEdad();
        jose.calcularSalario();
    }
}
