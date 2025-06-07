public abstract class Vehiculos {
    
    public abstract void avanzar();
    
    public static void prender(Vehiculos a) {
        a.avanzar();
    }
}