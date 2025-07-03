import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al programa que pidió el profe en clase");
    System.out.println();

    System.out.print("Ingresa tu año de nacimiento: ");
    int anioNacimiento = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingresa el año actual: ");
    int anioActual = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingresa un año cualquiera: ");
    int anioCualquiera = scanner.nextInt();

    if (anioCualquiera < anioActual) {
      System.out.printf("Han pasado %d año(s) de tu año de nacimiento al actual.%n", anioActual - anioNacimiento);
      System.out.printf("Han pasado %d año(s) desde el año cualquiera al actual.%n", anioActual - anioCualquiera);
    } else {
      System.out.printf("Han pasado %d año(s) de tu año de nacimiento al actual.%n", anioActual - anioNacimiento);
      System.out.printf("Faltan %d para llegar al año cualquiera%n", anioCualquiera - anioActual);
      System.out.printf("Tendrás %d año(s) para cuando lleguemos al año cualquiera.%n",anioCualquiera - anioNacimiento);
    }

    System.out.println("By mingood");

    scanner.close();
  }
}
