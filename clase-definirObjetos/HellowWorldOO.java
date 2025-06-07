/**
 * Datos miembro,atributos o caracteristicas
 */
public class HellowWorldOO {
    private String mensaje;

    //Los metodos set sirve para asignar valor a cada dato miembro
    //Los metodos get me sirve para obtener el valor de un dato miembro
    //Metodos de solucion - muestra el mensaje

    /**
     * Metodos u operaciones
     * @param Mensaje que quiero mostrar
     * @return Regresa el mensaje que quieres mostrar
     */
    public void setMensaje(String msg) {
        this.mensaje = msg;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void muestraMensaje() {
        System.out.println(getMensaje());
    }
}
