
package Procesadores;

public class Procesadores_AMD extends Procesadores {
    boolean sensero_temperatura;

    public Procesadores_AMD() {}

    public Procesadores_AMD(int nucleos, String nombre, double velocidad, double consumo, boolean sensero_temperatura) {
        super(nucleos, nombre, velocidad, consumo);
        this.sensero_temperatura = sensero_temperatura;
    }

    public boolean isSensero_temperatura() {
        return sensero_temperatura;
    }

    public void setSensero_temperatura(boolean sensero_temperatura) {
        this.sensero_temperatura = sensero_temperatura;
    }
    public void imprimir_datos_escritorio()
    {
        System.out.println("Sensor de temperatura: " + this.sensero_temperatura);
    }
}

