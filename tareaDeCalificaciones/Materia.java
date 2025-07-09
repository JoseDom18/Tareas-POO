import java.util.ArrayList;
import java.util.Scanner;

public class Materia {

  private String nombre;
  private int cal;


  public Materia(String nombre, int cal) {
    this.nombre = nombre;
    this.cal = cal;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCal() {
    return cal;
  }

  public void setCal(int cal) {
    this.cal = cal;
  }

  public static int sacarPromedio(ArrayList<Materia> a) {
    int sumaCal = 0;
    for (Materia cal : a) {
      sumaCal += cal.getCal();
    }
    int promedio = sumaCal / 5;

    return promedio;
  }

  public static void pedirCalificaciones(String[] materias, ArrayList<Materia> listaMaterias, Scanner sc) {
    for (int i = 0; i < 5; i++) {
      int cal = -1;
      do {
        System.out.printf("Ingresa la calificación de %s: ", materias[i]);
        if (sc.hasNextInt()) {
          cal = sc.nextInt();
          sc.nextLine();
          if (cal < 0) {
            System.out.println("La calificacion tiene que ser positiva.");
          }
        } else {
          System.out.println("Este caracter no es valido.");
          sc.next();
        }
      } while (cal < 0);
      Materia a = new Materia(materias[i], cal);
      listaMaterias.add(a);
    }
  }

}
