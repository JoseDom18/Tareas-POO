import java.util.Scanner;

public class AnioSeleccionado implements Validacion {

  public void AnioSelec(Scanner scanner) {

    int anioNacimiento;
    do {
      System.out.print("Ingresa tu año de nacimiento: ");
      anioNacimiento = validacionAnio(scanner);
      if (anioNacimiento < 0) {
        System.out.println("El año debe ser positivo.");
      }
    } while (anioNacimiento < 0);

    int anioActual;
    do {
      System.out.print("Ingresa el año actual: ");
      anioActual = validacionAnio(scanner);
      if (anioActual < 0) {
        System.out.println("El año debe ser positivo.");
      }
    } while (anioActual < 0);
    
    int anioCualquiera;
    do {
      System.out.print("Ingresa un año cualquiera: ");
      anioCualquiera = validacionAnio(scanner);
      if (anioCualquiera < 0) {
        System.out.println("El año debe ser positivo.");
      }
    } while (anioCualquiera < 0);

    System.out.println();

    System.out.printf("1. Han pasado %d año(s) de tu año de nacimiento al actual.%n", anioActual - anioNacimiento);
    if (anioCualquiera <= anioActual) {
      if (anioActual - anioCualquiera == 0) {
        System.out.println("2. El año seleccionado es el mismo que el actual.");
      } else {
        System.out.printf("2. Han pasado %d año(s) desde %d (Año cualquiera) a %d (actual).%n", anioActual - anioCualquiera, anioCualquiera, anioActual);
      }
    } else {
      /*
       * System.out.printf("Han pasado %d año(s) de tu año de nacimiento al actual.%n"
       * , anioActual - anioNacimiento);
       */
      System.out.printf("2. Faltan %d para llegar al año %d (cualquiera)%n", anioCualquiera - anioActual, anioCualquiera);
      System.out.printf("3. Tendrás %d año(s) para cuando lleguemos al año %d (cualquiera).%n",
          anioCualquiera - anioNacimiento, anioCualquiera);
    }
  }
}
