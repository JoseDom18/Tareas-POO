import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase me ayudara a representar las letras usando un sistema de
 * coordenadas en matriz 2x2
 * 
 * @author Jose Hernandez - AKA Mingood.
 * @version 1.0
 */
public class CaracterCoordenadas {

  /**
   * Se usa para comparar con la entrada de teclado.
   */
  private Character name;

  /**
   * Lista de cordenadas en matriz 2x2.
   */
  private Boolean[][] coor;

  /**
   * Se brindan las corrdenadas de la letra para construirla
   * 
   * @param name  Sirve para identificar la letra
   * @param colum Sirve para poner el numero de columna
   * @param row   Sirve para poner el numero de fila
   */
  public CaracterCoordenadas(Character name, Boolean[][] coor) {

    this.name = name;
    this.coor = coor;

  }

  /**
   * Sirve para conocer el caracter.
   * 
   * @return El caracter en cuestion.
   */

  public Character getName() {
    return name;
  }

  /**
   * Regresa las coordenadas.
   * 
   * @return Las coodenadas en matriz 2x2.
   */

  public Boolean[][] getCoor() {
    return coor;
  }

  /**
   * Imprime las letras dependiendo sus cordenadas en una matriz 2x2
   */

  public static void imprimir(String s, Map<Character, CaracterCoordenadas> abecedario) {

    char[] charXSeparado = s.toCharArray();
    int ancho = charXSeparado.length * 5;
    Character[][] lienzo = new Character[9][ancho];

    int aumento = 0;
    for (int m = 0; m < charXSeparado.length; m++) {

      Character letra = (Character) charXSeparado[m];

      if (abecedario.containsKey(letra)) {
        CaracterCoordenadas a = abecedario.get(letra);
        Boolean[][] coor = a.getCoor();

        for (int i = 0; i < 9; i++) {
          for (int j = 0; j < ancho; j++) {
            if (coor[i][j + aumento] != null) {
              lienzo[i][j] = '*';
            } else {
              lienzo[i][j] = '-';
            }
          }
        }
      }
      if (m < charXSeparado.length - 1) {
        aumento += 5;
      }
    }
    for (int k = 0; k < 9; k++) {
      for (int l = 0; l < ancho; l++) {
        System.out.print(lienzo[k][l]);
      }
      System.out.println();
    }
    System.out.println("Gracias por usar mi programa. by - Mingood.");

  }

}