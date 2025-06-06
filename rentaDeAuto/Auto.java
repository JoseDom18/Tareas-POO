package rentaDeAuto;

public class Auto {
    private String modelo;
    private int costo_fijo;
    private int kilometros;

    public Auto(String modelo, int costo_fijo) {
        this.modelo = modelo;
        this.costo_fijo = costo_fijo;
        this.kilometros = 0;
    }

    public int sumarKilometros(int distancia) {
        return kilometros += distancia;
    }

    public void calcular_precio() {
        //costo por km arriba de 1000
        int kmMayor = (this.kilometros - 1000) * 30;
        // costo por km entre 300 y 1000
        int kmMedio = (this.kilometros - 300) * 20;
        // costo_final
        int costo_final = costo_fijo;

        if (kilometros > 1000) {
            costo_final += kmMayor;
            costo_final += (1000 - 300) * 20;;
              
        } else if (kilometros > 300) {
            costo_final += kmMedio;
            
        }
        System.out.printf("Vehiculo: %s. El costo a pagar es de %d.%n", this.modelo , costo_final);
    }
}
