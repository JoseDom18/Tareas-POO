public class Suma {
    private double valor1;
    private double valor2;

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void suma() {
        System.out.printf("El resultado de la suma de %.2f y %.2f es: %.2f.%n",getValor1(), getValor2(), getValor1() + getValor2());
    }

}
