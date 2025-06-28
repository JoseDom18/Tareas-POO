import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Version2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] a = { "**** ", "*  *", "*  *", "**** ", "*  *", "*  *" };
    String[] j = { "**** ", "  *  ", "  *  ", "  *  ", "*  * ", "****" };

    Map<Character, String[]> letras = new HashMap<>();
    letras.put('A', a);
    letras.put('J', j);

    System.out.println("Ingresa tu nombre: ");
    String nombre = scanner.nextLine().toUpperCase();

    char[] cadena = nombre.toCharArray();

    for (int i = 0; i < cadena.length; i++) {
      if (letras.containsKey(cadena[i])) {
        System.out.println(letras.get(cadena[i])); 
      }
    }



    scanner.close();
  }

}
