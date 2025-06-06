package rentaDeAuto;
public class RentaAuto {
    public static void main(String[] args) {
        Auto c1 = new Auto("Tacoma",5000);

        c1.sumarKilometros(500);
        c1.calcular_precio();
    }
}
