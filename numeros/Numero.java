
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
    private final boolean positivo;
    /**
     * Sirver para determinar si el numero es par.
     */
    private final boolean par;

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
    public static ArrayList<Numero> crearLista(Scanner scanner) {
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

        return listaNumeros;
    }

    /**
     * Listar una lista a manera de prueba.
     * 
     */
    public static void pruebaLista(Scanner scanner) {
        ArrayList<Numero> lista = crearLista(scanner);
        for (Numero a : lista) {
            System.out.println(a.getValor());
        }
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Crea una lista y suma los primeros 5 numeros de una lista.
     * 
     * @return La suma de los primeros 5 numeros de la lista.
     */
    public static void suma5numeros(Scanner scanner) {

        System.out.println("Se sumaran los primero 5 numeros de una lista.");
        System.out.println();

        ArrayList<Numero> lista = crearLista(scanner);
        int suma5numeros = 0;

        for (int i = 0; i < 5 && i < lista.size(); i++) {
            suma5numeros += lista.get(i).getValor();
        }

        System.out.printf("El resultado de la suma es: %d.%n", suma5numeros);

        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Menciona si un numero es positivo o negativo.
     */
    public static void pos_neg(Scanner scanner) {

        System.out.println("Es positivo o negativo??");

        System.out.print("Ingresa un numero: ");
        int valor = scanner.nextInt();

        Numero numero = new Numero(valor);

        if (numero.isPositivo()) {
            System.out.println("El numero que ingresaste es positivo.");
        } else {
            System.out.println("El numero que ingresaste es negativo.");
        }

        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Menciona si un numero es par o impar.
     */
    public static void par_impar(Scanner scanner) {

        System.out.println("Es par o impar??");

        System.out.print("Ingresa un numero: ");
        int valor = scanner.nextInt();

        Numero numero = new Numero(valor);

        if (numero.isPar()) {
            System.out.println("El numero que ingresaste es par.");
        } else {
            System.out.println("El numero que ingresaste es impar.");
        }

        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * De una lista de 10 numeros cuenta cuantos son positivos, negativos, pares e
     * impares.
     */
    public static void clasificaNumeros(Scanner scanner) {

        System.out.println("<<<Clasifiquemos numeros>>>");

        ArrayList<Numero> lista = crearLista(scanner);

        int contadorPos = 0;
        int contadorNeg = 0;
        int contadorPar = 0;
        int contadorImp = 0;

        for (Numero numero : lista) {

            if (numero.isPositivo()) {
                contadorPos++;
            } else {
                contadorNeg++;
            }

            if (numero.isPar()) {
                contadorPar++;
            } else {
                contadorImp++;
            }
        }

        System.out.printf(
                "Se encontraron los siguientes tipos de numeros.%nPares: %d%nImpares: %d%nPositivos: %d%nNegativos: %d%n",
                contadorPar, contadorImp, contadorPos, contadorNeg);

        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Realiza la tabla de multiplicar del numero recibido por teclado.
     * 
     * @param scanner es la entrada del objeto scanner por teclado.
     */
    public static void multiplicar(Scanner scanner) {

        System.out.println("Tabla de multiplicar.");
        System.out.print("Ingresa un numero para crear su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Realiza un operacion factorial del numero ingresado.
     * 
     * @param scanner es la entrada del objeto scanner por teclado.
     */
    public static void factorial(Scanner scanner) {

        System.out.println("<<<Factorial de un numero.>>>");

        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        int f = numero;

        for (int i = numero - 1; i > 0; i--) {
            f *= i;
        }

        System.out.printf("El numero factorial de %d es: %d.", numero, f);
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Realiza una serie de fibonnacci
     * 
     * @param scanner es la entrada del objeto scanner por teclado.
     */
    public static void fibonnacci(Scanner scanner) {

        System.out.println("<<<Serie de fibonnacci.>>>");
        System.out.print("Cuantos numeros quieres que tenga tu serie: ");
        int limite = scanner.nextInt();

        int a = 1;
        int b = 0;

        for (int i = 0; i < limite; i++) {
            int c = a + b;
            System.out.printf("%d", c);
            if (i < limite - 1) {
                System.out.print("-");
            }
            a = b;
            b = c;
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Recibe dos numeros por teclado y obtiene su MCD.
     * 
     * @param scanner es la entrada del objeto scanner por teclado.
     */
    public static void mcd(Scanner scanner) {

        // pido dos numeros por teclado
        System.out.println("<<<MCD>>>");
        System.out.print("Ingresa un primer numero: ");
        int maximo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresa un segundo numero: ");
        int minimo = scanner.nextInt();
        scanner.nextLine();

        // variables creadas para proteger mi maximo y minimo he imprimirlos al final.
        int aux = 0;
        int termino1 = maximo;
        int termino2 = minimo;

        // acomodo de varibles maximo y minimo
        if (minimo > maximo) {
            aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        // aplicacion de algoritmo de euclides maximo entre minimo, el nuevo maximo es
        // el minimo y el nuevo minimo es el resto de la division.
        do {

            aux = maximo % minimo;
            maximo = minimo;
            minimo = aux;

        } while (minimo != 0);

        System.out.printf("El MCD de %d y %d es: %d.%n", termino1, termino2, maximo);

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    /**
     * Recibe dos numeros por teclado y obtiene su MCD.
     * 
     * @param scanner es la entrada del objeto scanner por teclado.
     */
    public static void primo(Scanner scanner) {

        System.out.println("<<<Es primo??>>>");
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        boolean primo = false;

        for (int i = 1; i <= numero + 1; i++) {
            if (numero % i != 0 && numero == i) {
                primo = true;
            } else {
                primo = false;
            }
        }

        if (primo) {
            System.out.printf("%d es un numero primo.%n", numero);
        } else {
            System.out.printf("%d NO es un numero primo.%n", numero);
        }

        System.out.println();
        System.out.println("Gracias por usar mi programa. by - Mingood.");
        System.out.println();
    }

    // numero primo, elabore un programa que mediante un ciclo descubra si un número
    // es primo o no.
    // numero perfecto, Un número perfecto es un número natural que es igual a la
    // suma de sus divisores propios positivos, sin incluirse él mismo.

}