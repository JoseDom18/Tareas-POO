import java.util.Scanner;

public class TestAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anio a = new Anio();

        a.bisiesto(scanner);
        
        scanner.close();
    }

}
