package Main;

import Objetos.Planeta;
import Objetos.Planeta.tipoPlaneta;

public class Ejecutar {

    private Object p_1;

    public static void main(String[] args) {
        Planeta p_1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742,
                150000000, tipoPlaneta.TERRESTRE, true);

        System.out.println("Nombre del planeta = " + p_1.nombre());
        System.out.println("Cantidad de Satelites = " + p_1.cantidadSatelites());
        System.out.println("Masa del planeta = " + p_1.masa());
        System.out.println("Volumen del planeta = " + p_1.volumen());
        System.out.println("Diametro del planeta = " + p_1.diametro());
        System.out.println("Distancia al sol = " + p_1.distanciaMediaALsol());
        System.out.println("Tipo del planeta = " + p_1.tipo());
        System.out.println("Es observable = " + p_1.esObservable());
        System.out.println("Densidad del planeta = " + p_1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p_1.esPlanetaExterior());
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");

        Planeta p_2 = new Planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820,
                750000000, tipoPlaneta.GASEOSO, true);
        
        System.out.println("Nombre del planeta = " + p_2.nombre());
        System.out.println("Cantidad de Satelites = " + p_2.cantidadSatelites());
        System.out.println("Masa del planeta = " + p_2.masa());
        System.out.println("Volumen del planeta = " + p_2.volumen());
        System.out.println("Diametro del planeta = " + p_2.diametro());
        System.out.println("Distancia al sol = " + p_2.distanciaMediaALsol());
        System.out.println("Tipo del planeta = " + p_2.tipo());
        System.out.println("Es observable = " + p_2.esObservable());
        System.out.println("Densidad del planeta = " + p_2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p_2.esPlanetaExterior());
    }
}
