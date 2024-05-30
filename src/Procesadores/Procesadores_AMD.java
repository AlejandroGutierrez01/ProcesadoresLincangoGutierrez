package Procesadores;

public class Procesadores_AMD extends Procesadores_escritorio {
    boolean sensero_temperatura;

    public Procesadores_AMD() {}

    public Procesadores_AMD(int nucleos, String nombre, double velocidad, double consumo, String socket, boolean sensero_temperatura) {
        super(nucleos, nombre, velocidad, consumo, socket);
        this.sensero_temperatura = sensero_temperatura;
    }

    public boolean isSensero_temperatura() {
        return sensero_temperatura;
    }

    public void setSensero_temperatura(boolean sensero_temperatura) {
        this.sensero_temperatura = sensero_temperatura;
    }
    public void imprimir_datos_Procesadores_AMD(){
        System.out.println("Sensor de temperatura: " + this.sensero_temperatura);
    }
}

