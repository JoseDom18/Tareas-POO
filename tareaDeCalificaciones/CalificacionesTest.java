import java.util.ArrayList;
import java.util.Scanner;

public class CalificacionesTest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido conoce tu promedio");

    String[] materias = { "Ingles", "Calculo", "Programación", "Base de datos", "Proyecto integrador"};

    ArrayList<Materia> listaMaterias = new ArrayList<>();

   /*  for (int i = 0; i < 5; i++) {
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
   } */
   Materia.pedirCalificaciones(materias, listaMaterias, sc);

    System.out.printf("El promedio de las siguientes calificaciones fue %d.%n", Materia.sacarPromedio(listaMaterias));
    
    for (Materia mat : listaMaterias) {
      System.out.println(mat.getCal());
    }

    sc.close();
  }
}
