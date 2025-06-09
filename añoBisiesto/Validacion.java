import java.util.Scanner;

public interface Validacion {

     public default int validacionAnio(Scanner scanner) {
        
        int anio;
        while (true) {
            if (scanner.hasNextInt()) {
                anio = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Entrada no valida, ingrese una año valido.");
                scanner.nextLine();
            }
        }
        return anio;
    }
}
