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
        prom2.imprimir_datos();
        //Integrante Alejandro Gutiérrez

        Procesadores_INTEL proIn1 = new Procesadores_INTEL();

        Procesadores_INTEL proIn2 = new Procesadores_INTEL(4, "Intel Core i5", 2.4, 3.5, "LGA", false);
        proIn2.imprimir_datos();

        //Integrante Jose Lincango
        Procesadores_AMD prom3 = new Procesadores_AMD();
        Procesadores_AMD prom4 = new Procesadores_AMD(5, "AMD Ryzen 7000 series", 2.5, 2.0, "Mai", true);
        prom4.imprimir_datos();
    }
}