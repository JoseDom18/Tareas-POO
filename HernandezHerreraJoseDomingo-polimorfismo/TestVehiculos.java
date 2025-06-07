public class TestVehiculos {
    public static void main(String[] args) {
        Carro c = new Carro();
        Barco b = new Barco();
        Avion a = new Avion();
        Bicicleta bici = new Bicicleta();
        Motocicleta moto = new Motocicleta();


        Vehiculos.prender(c);
        Vehiculos.prender(b);
        Vehiculos.prender(a);
        Vehiculos.prender(bici);
        Vehiculos.prender(moto);
        moto.caballito();
        

        
    }

   
}
