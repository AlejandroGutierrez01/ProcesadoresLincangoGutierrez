package Procesadores;

public class Procesadores_INTEL extends Procesadores_escritorio{
    boolean tarjeta_video;

    public Procesadores_INTEL() {}

    public Procesadores_INTEL(int nucleos, String nombre, double velocidad, double consumo, String socket, boolean tarjeta_video) {
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
