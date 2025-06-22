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
  Boolean[][] coorS = new Boolean[9][ancho];
    coorS[0][0 + 10] = true;
    coorS[0][1 + 10] = true;
    coorS[0][2 + 10] = true;
    coorS[0][3 + 10] = true;
    coorS[1][0 + 10] = true;
    coorS[2][0 + 10] = true;
    coorS[3][0 + 10] = true;
    coorS[4][0 + 10] = true;
    coorS[4][1 + 10] = true;
    coorS[4][2 + 10] = true;
    coorS[4][3 + 10] = true;
    coorS[5][3 + 10] = true;
    coorS[6][3 + 10] = true;
    coorS[7][3 + 10] = true;
    coorS[8][0 + 10] = true;
    coorS[8][1 + 10] = true;
    coorS[8][2 + 10] = true;
    coorS[8][3 + 10] = true;

  /**
   * Mapeo de objetos, cada caracter es un objeto
   */
  Boolean[][] coorj = new Boolean[9][ancho];
  coorj[0][3]=true;
  coorj[1][3]=true;
  coorj[2][3]=true;
  coorj[3][3]=true;coorj[4][3]=true;coorj[5][3]=true;coorj[6][0]=true;coorj[6][3]=true;coorj[7][0]=true;coorj[7][3]=true;coorj[8][0]=true;coorj[8][1]=true;coorj[8][2]=true;coorj[8][3]=true;



  Boolean[][] coorO = new Boolean[9][ancho];coorO[0][0+5]=true;coorO[0][1+5]=true;coorO[0][2+5]=true;coorO[0][3+5]=true;coorO[1][0+5]=true;coorO[1][3+5]=true;coorO[2][0+5]=true;coorO[2][3+5]=true;coorO[3][0+5]=true;coorO[3][3+5]=true;coorO[2][3+5]=true;coorO[4][0+5]=true;coorO[4][3+5]=true;coorO[5][0+5]=true;coorO[5][3+5]=true;coorO[6][0+5]=true;coorO[6][3+5]=true;coorO[7][0+5]=true;coorO[7][3+5]=true;coorO[8][0+5]=true;coorO[8][1+5]=true;coorO[8][2+5]=true;coorO[8][3+5]=true;

  Boolean[][] coorS = new Boolean[9][ancho];coorS[0][0+10]=true;coorS[0][1+10]=true;coorS[0][2+10]=true;coorS[0][3+10]=true;coorS[1][0+10]=true;coorS[2][0+10]=true;coorS[3][0+10]=true;coorS[4][0+10]=true;coorS[4][1+10]=true;coorS[4][2+10]=true;coorS[4][3+10]=true;coorS[5][3+10]=true;coorS[6][3+10]=true;coorS[7][3+10]=true;coorS[8][0+10]=true;coorS[8][1+10]=true;coorS[8][2+10]=true;coorS[8][3+10]=true;

  Boolean[][] coorE = new Boolean[9][ancho];coorE[0][0+15]=true;coorE[0][1+15]=true;coorE[0][2+15]=true;coorE[0][3+15]=true;coorE[1][0+15]=true;coorE[2][0+15]=true;coorE[3][0+15]=true;coorE[4][0+15]=true;coorE[4][1+15]=true;coorE[4][2+15]=true;coorE[4][3+15]=true;coorE[5][0+15]=true;coorE[6][0+15]=true;coorE[7][0+15]=true;coorE[8][0+15]=true;coorE[8][1+15]=true;coorE[8][2+15]=true;coorE[8][3+15]=true;

  /**
   * Imprime las letras dependiendo sus cordenadas en una matriz 2x2
   */
  public static void imprimir(CaracterCoordenadas a, String s) {
    char[] charArray = s.toCharArray();
    int ancho = charArray.length * 5;
    Character[][] lienzo = new Character[7][ancho];
    Boolean[][] coor = a.getCoor();
    Map<Character, CaracterCoordenadas> map = new HashMap<>();
    map.put('J', a); 

    for (int m = 0; m < charArray.length; m++) {
      if (charArray[m].equals){

      }
    }

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < ancho; j++) {
        if (coor[i][j] != null) {
          lienzo[i][j] = '*';
        } else {
          lienzo[i][j] = ' ';
        }
      }
    }

    for (int k = 0; k < 7; k++) {
      for (int l = 0; l < ancho; l++) {
        System.out.print(lienzo[k][l]);
      }
      System.out.println();
    }

    System.out.println("Gracias por usar mi programa. by - Mingood.");
  }

}