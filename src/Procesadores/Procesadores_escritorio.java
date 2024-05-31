package Procesadores;

public class Procesadores_escritorio extends Procesadores {
    String socket;
    public Procesadores_escritorio() {}

    public Procesadores_escritorio(int nucleos, String nombre, double velocidad, double consumo, String socket) {
        super(nucleos, nombre, velocidad, consumo);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    public void imprimir_datos_escritorio() {
        System.out.println("Socket: " + this.socket);
    }
    @Override
    public void imprimir_datos(){
        System.out.println("Procesador escritorio");
    }
}
