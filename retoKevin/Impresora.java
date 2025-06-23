import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Impresora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /* int ancho = 5 * 4; */

    Boolean[][] coorj = new Boolean[9][20];
    coorj[0][3] = true;
    coorj[1][3] = true;
    coorj[2][3] = true;
    coorj[3][3] = true;
    coorj[4][3] = true;
    coorj[5][3] = true;
    coorj[6][0] = true;
    coorj[6][3] = true;
    coorj[7][0] = true;
    coorj[7][3] = true;
    coorj[8][0] = true;
    coorj[8][1] = true;
    coorj[8][2] = true;
    coorj[8][3] = true;

    CaracterCoordenadas J = new CaracterCoordenadas('J', coorj);

    Boolean[][] coorO = new Boolean[9][20];
    coorO[0][0] = true;
    coorO[0][1] = true;
    coorO[0][2] = true;
    coorO[0][3] = true;
    coorO[1][0] = true;
    coorO[1][3] = true;
    coorO[2][0] = true;
    coorO[2][3] = true;
    coorO[3][0] = true;
    coorO[3][3] = true;
    coorO[2][3] = true;
    coorO[4][0] = true;
    coorO[4][3] = true;
    coorO[5][0] = true;
    coorO[5][3] = true;
    coorO[6][0] = true;
    coorO[6][3] = true;
    coorO[7][0] = true;
    coorO[7][3] = true;
    coorO[8][0] = true;
    coorO[8][1] = true;
    coorO[8][2] = true;
    coorO[8][3] = true;

    CaracterCoordenadas O = new CaracterCoordenadas('O', coorO);

    Boolean[][] coorS = new Boolean[9][20];
    coorS[0][0] = true;
    coorS[0][1] = true;
    coorS[0][2] = true;
    coorS[0][3] = true;
    coorS[1][0] = true;
    coorS[2][0] = true;
    coorS[3][0] = true;
    coorS[4][0] = true;
    coorS[4][1] = true;
    coorS[4][2] = true;
    coorS[4][3] = true;
    coorS[5][3] = true;
    coorS[6][3] = true;
    coorS[7][3] = true;
    coorS[8][0] = true;
    coorS[8][1] = true;
    coorS[8][2] = true;
    coorS[8][3] = true;

    CaracterCoordenadas S = new CaracterCoordenadas('S', coorS);

    Boolean[][] coorE = new Boolean[9][20];
    coorE[0][1] = true;
    coorE[0][2] = true;
    coorE[0][0] = true;
    coorE[0][3] = true;
    coorE[1][0] = true;
    coorE[2][0] = true;
    coorE[3][0] = true;
    coorE[4][0] = true;
    coorE[4][1] = true;
    coorE[4][2] = true;
    coorE[4][3] = true;
    coorE[5][0] = true;
    coorE[6][0] = true;
    coorE[7][0] = true;
    coorE[8][0] = true;
    coorE[8][1] = true;
    coorE[8][2] = true;
    coorE[8][3] = true;

    CaracterCoordenadas E = new CaracterCoordenadas('O', coorE);

    Map<Character, CaracterCoordenadas> abecedario = new HashMap<>();
    abecedario.put('J', J);
    abecedario.put('O', O);
    abecedario.put('S', S);
    abecedario.put('E', E);

    
    
    // Character[][] lienzo = new Character[9][ancho];
    
    // for (int i = 0; i < 9; i++) {
      //   for (int j = 0; j < ancho; j++) {
        //     if (coorj[i][j] != null || coorO[i][j] != null || coorS[i][j] != null || coorE[i][j] != null) {
          //       lienzo[i][j] = '*';
          //     } else {
            //       lienzo[i][j] = ' ';
            //     }
            //   }
            // }
            
            // for (int k = 0; k < 9; k++) {
              //   for (int l = 0; l < ancho; l++) {
                //     System.out.print(lienzo[k][l]);
                //   }
                //   System.out.println();
                // }
                
                // System.out.println("Gracias por usar mi programa. by - Mingood.");
                
                System.out.println("Bienvenido al dibujador de nombres.");
                System.out.print("Ingresa un tu nombre: ");
                String s = scanner.nextLine().toUpperCase();
                System.out.println();
                
                CaracterCoordenadas.imprimir(s, abecedario);
                
    scanner.close();
  }

}
