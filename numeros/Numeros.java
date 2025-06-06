import java.util.Scanner;

public class Numeros {
    

    public static void pos_neg(int value) {
        int contaPositivo = 0;
        int contaNegativo = 0;
        if (value == 0) {
            System.out.println("Gracias por usar mi programa. - Mingood.");
        } else if (value > 0) {
            System.out.println("El numero es Positivo.");
            contaPositivo++;
        } else {
            System.out.println("El numero es Negativo.");
            contaNegativo++;
        }
    }

    public static void par_impar(int value) {
        int contaPar = 0;
        int contaImpar = 0;
        if (value == 0) {
            System.out.println("good bye.");
        } else if (value % 2 == 0) {
            System.out.println("El numero es par.");
            contaPar++;
        } else {
            System.out.println("El numero es impar.");
            contaImpar++;
        }
    }

    public static int contador() {
        
    }

    public static void iniciar() {
        
        Scanner scanner = new Scanner(System.in);
        int limite = 10;
        while (limite > 0) {
            System.out.print("Ingresa diez numeros por teclado : ");
            int value = scanner.nextInt();
            Numeros.pos_neg(value);
            Numeros.par_impar(value);
            limite--;

            
        }

        System.out.printf("Se contaron %d numero(s) positivos.%n", contaPositivo);
        scanner.close();
    }
    
}