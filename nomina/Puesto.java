/**
 * Listado de cargos.
 */
public enum Puesto {

    Gerente(15000),
    Coordinador(8500),
    Obrero(4000);

    private int salarioBase;

    Puesto(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

}
