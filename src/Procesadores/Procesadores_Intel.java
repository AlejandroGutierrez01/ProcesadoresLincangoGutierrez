package Procesadores;

public class Procesadores_Intel extends Procesadores_escritorio{
    boolean tarjeta_video;

    public Procesadores_Intel() {}

    public Procesadores_Intel(int nucleos, String nombre, double velocidad, double consumo, String socket, boolean tarjeta_video) {
        super(nucleos, nombre, velocidad, consumo, socket);
        this.tarjeta_video = tarjeta_video;
    }

    public boolean isTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
}
