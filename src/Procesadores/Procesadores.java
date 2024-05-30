package Procesadores;

public class Procesadores {
    int nucleos;
    double consumo, velocidad;
    String nombre;

    public Procesadores() {}

    public Procesadores(int nucleos, String nombre, double velocidad, double consumo) {
        this.nucleos = nucleos;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.consumo = consumo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos personalizados
    public void imprimir_datos(){
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);
    }

}
