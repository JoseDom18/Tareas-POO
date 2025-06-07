
/**
 * La clase numero proporciona diferentes metodo para resolver ejercicios relacionados con numeros.
 * 
 * @author Jose Domingo Hernandez
 * @version 1.0
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Numero {
    /**
     * Sirve para determinar el valor del numero.
     */
    private int valor;
    /**
     * Sirve para determinar si el numero es positivo.
     */
    private boolean positivo;
    /**
     * Sirver para determinar si el numero es par.
     */
    private boolean par;

    /**
     * Sirve para crear un nuevo numero y de manera automatica dice si es positivo o
     * negativo y par o impar.
     * 
     * @param valor
     */
    public Numero(int valor) {
        this.valor = valor;
        if (valor >= 0) {
            this.positivo = true;
        } else {
            this.positivo = false;
        }

        if (valor % 2 == 0) {
            this.par = true;
        } else {
            this.par = false;
        }
    }

    /**
     * Devuelve el valor del objeto numero.
     * 
     * @return El valor del numero.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Cambia el valor del objeto numero.
     * 
     * @param valor Nuevo valor del numero.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Para conocer si el numero es positivo o en su defecto negativo.
     * 
     * @return Si el numero es positivo dara true.
     */
    public boolean isPositivo() {
        return positivo;
    }

    /**
     * Para conocer si el nuemero es par o en su defecto impar.
     * 
     * @return Si el nuemro es par dara true.
     */
    public boolean isPar() {
        return par;
    }

    /**
     * Realiza una cuenta regresiva del 15 al 1.
     */
    public static void cuentaReversa() {
        System.out.println("Empieza una cuenta regresiva del 15 al 1.");
        for (int i = 15; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Cuenta terminada. by - Mingood.");
    }

    /**
     * Crea una lista de numeros.
     */
    public static ArrayList<Numero> crearLista() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Numero> listaNumeros = new ArrayList<>();

        int cantidad = 0;

        System.out.println("Ha iniciado la creacion de una lista de numeros.");
        System.out.print("Que cantidad de numeros quiere en su lista: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un numero: ");
            int valor = scanner.nextInt();
            scanner.nextLine();

            Numero nuevoNumero = new Numero(valor);
            listaNumeros.add(nuevoNumero);
        }

        scanner.close();

        return listaNumeros;
    }

    /**
     * Listar una lista a manera de prueba.
     * 
     */
    public static void pruebaLista() {

        for (Numero a : Numero.crearLista()) {
            System.out.println(a.getValor());
        }
    }

    /**
     * Crea una lista y suma los primeros 5 numeros de una lista.
     * 
     * @return La suma de los primeros 5 numeros de la lista.
     */
    public static int suma5numeros() {
        ArrayList<Numero> lista = Numero.crearLista();
        int suma5numeros = 0;
        //Numero.crearLista();
        for(int i = 0; i < 5; i++) {
                suma5numeros += lista.get(i).getValor();
           }
        return suma5numeros;
    }
    
    
    // suma de primeros 5 numeros
    // 10 numeros por teclado y muestre cuantos fueron positivos y negativos
    // 10 numeros por teclado y muestre cuantos fueron pares y impares
    // factorial
    // recibir por teclado y listar tabla de multipicar
    // maximo comun divisor
    // serie de fibonacci
    // numero primo, elabore un programa que mediante un ciclo descubra si un número
    // es primo o no.
    // numero perfecto, Un número perfecto es un número natural que es igual a la
    // suma de sus divisores propios positivos, sin incluirse él mismo.

    // public static void pos_neg(int value) {
    // int contaPositivo = 0;
    // int contaNegativo = 0;
    // if (value == 0) {
    // System.out.println("Gracias por usar mi programa. - Mingood.");
    // } else if (value > 0) {
    // System.out.println("El numero es Positivo.");
    // contaPositivo++;
    // } else {
    // System.out.println("El numero es Negativo.");
    // contaNegativo++;
    // }
    // }

    // public static void par_impar(int value) {
    // int contaPar = 0;
    // int contaImpar = 0;
    // if (value == 0) {
    // System.out.println("good bye.");
    // } else if (value % 2 == 0) {
    // System.out.println("El numero es par.");
    // contaPar++;
    // } else {
    // System.out.println("El numero es impar.");
    // contaImpar++;
    // }
    // }

    // public static int contador() {

    // }

    // public static void iniciar() {

    //     Scanner scanner = new Scanner(System.in);
    //     int limite = 10;
    //     while (limite > 0) {
    //         System.out.print("Ingresa diez numeros por teclado : ");
    //         int value = scanner.nextInt();
    //         Numeros.pos_neg(value);
    //         Numeros.par_impar(value);
    //         limite--;

    //     }

    //     System.out.printf("Se contaron %d numero(s) positivos.%n", contaPositivo);
    //     scanner.close();
    // }

}