import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    AnioSeleccionado a = new AnioSeleccionado();

    System.out.println("Bienvenido al programa que pidió el profe en clase");
    System.out.println();

    a.AnioSelec(scanner);
    

    System.out.println("By mingood");

    scanner.close();
  }
}
