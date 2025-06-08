/**
 * Simula un pincel que dibuja figuras en la terminal
 * 
 * @author Jose Hernandez. AKA - Mingood.
 * @version 1.0
 */
public class Pincel {

    /**
     * Dibuja un triangulo rectangulo.
     */
    public static void dibujarTRectangulo() {

        System.out.println("Triangulo rectangulo.");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
    }

    /**
     * Dibuja un triangulo isoceles.
     */
    public static void dibujarTIsoceles() {

        System.out.println("Triangulo isoceles.");
        int aumento = 1;
        int decremento = 10;

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < decremento; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < aumento; j++) {
                System.out.print("*");
            }
            System.out.println();
            aumento += 2;
            decremento -= 1;
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
    }
}