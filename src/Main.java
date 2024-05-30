import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_moviles;
import Procesadores.Procesadores_escritorio;
import Procesadores.Procesadores_INTEL;
public class Main {
    public static void main(String[] args) {

        //integrante Michelle Suarez
        Procesadores_moviles prom1 = new Procesadores_moviles();

        Procesadores_moviles prom2 = new Procesadores_moviles(4, "Snapdragon de Qualcomm", 5, 2.4, true);
        //Integrante Alejandro Gutiérrez

        Procesadores_INTEL proIn1 = new Procesadores_INTEL();

        Procesadores_INTEL proIn2 = new Procesadores_INTEL(4, "Intel Core i5", 2.4, 3.5, "LGA", false);

    }
}