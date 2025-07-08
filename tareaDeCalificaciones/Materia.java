import java.util.ArrayList;

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

}
