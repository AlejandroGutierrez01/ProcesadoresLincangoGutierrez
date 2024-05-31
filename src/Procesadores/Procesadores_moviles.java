package Procesadores;

public class Procesadores_moviles extends Procesadores{
    Boolean optimizacion;
    public Procesadores_moviles() {

    }

    public Procesadores_moviles(int nucleos, String nombre, double velocidad, double consumo, Boolean optimizacion) {
        super(nucleos, nombre, velocidad, consumo);
        this.optimizacion = optimizacion;
    }

    public Boolean getOptimizacion() {
        return optimizacion;
    }

    public void setOptimizacion(Boolean optimizacion) {
        this.optimizacion = optimizacion;
    }
    void imprimir_datos_moviles(){
        System.out.println(this.optimizacion);
    }
    @Override
    public void imprimir_datos(){
        System.out.println("Procesadores moviles");
    }
}


