import java.util.Scanner;

public class MatrizEscalonada {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    int input = scanner.nextInt();
    int[][] matriz = new int[input][input];
    int aumento = 0;
    int conteo = 1;
    int impresion = input;

    while (input > 0) {
      for (int i = 0; i < input; i++) {
        matriz[i + aumento][i] = conteo;
        conteo += 1;
      }
      input -= 1;
      aumento += 1;

    }
 
    for (int j = 0; j < impresion; j++) {
      for (int k = 0; k < impresion; k++) {
        if (matriz[j][k] != 0) {
          System.out.print(matriz[j][k] + " ");
        }
      }
      System.out.println();
    }

    scanner.close();
  }
}
