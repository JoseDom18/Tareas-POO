import java.util.Scanner;

/**
 * Clase que simula un año.
 * 
 * @author Jose Hernandez. AKA - Mingood.
 */
public class Anio implements Validacion {

    /**
     * Determina si un año es biciesto.
     * 
     * @return Un valor boleano para saber si es biciesto.
     */
    public boolean esBisiesto(Scanner scanner) {

        // que sea divisible por 4
        // que no sea divisible entre 100
        // que sea divisible entre 400

        boolean bisiesto = false;

        System.out.println("<<<Año bisiesto>>>");
        System.out.print("Ingresa un año: ");
        int anio = validacionAnio(scanner);

        if (anio % 4 == 0 && !(anio % 100 == 0) || anio % 400 == 0) {
            bisiesto = true;
        }

        return bisiesto;
    }

    /**
     * Mostrar si el año es bisiesto en pantalla.
     */ 
    public void bisiesto(Scanner scanner) {
        
        boolean bisiesto = esBisiesto(scanner);

        if (bisiesto) {
            System.out.println("Este año es bisiesto.");
        } else {
            System.out.println("Este año NO es bisiesto.");
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
    }
}