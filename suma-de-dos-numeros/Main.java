public class Main {
    public static void main(String[] args) {
        Suma suma1 = new Suma();

        suma1.setValor1(3);
        suma1.setValor2(2);
       
        Suma suma2 = new Suma();

        suma2.setValor1(3);
        suma2.setValor2(2);

        suma1.suma();

        System.out.println(suma2.getValor1() + suma2.getValor2() + suma1.getValor1() + suma1.getValor2());
    }
}
