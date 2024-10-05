package Objetos;

public class Planeta {

    // lo que esta en el ejercicio 
    // Definir atributos
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaMediaAlsol = 0;
    private tipoPlaneta tipo;
    private boolean esObservable = false;

    // Crear constructor
    public Planeta(String nombre, int cantidadSatelites, double masa,
            double volumen, int diametro, int distanciaMediaAlsol,
            tipoPlaneta tipo, boolean esObservable) {

        // inicializando todas las variables
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlsol = distanciaMediaAlsol;
        this.tipo = tipo;
        this.esObservable = esObservable;

    }

    // Definir metodos
    public String nombre() {
        return nombre;
    }

    public int cantidadSatelites() {
        return this.cantidadSatelites;
    }

    public double masa() {
        return this.masa;
    }

    public double volumen() {
        return this.volumen;
    }

    public int diametro() {
        return this.diametro;
    }

    public int distanciaMediaALsol() {
        return this.distanciaMediaAlsol;
    }

    public tipoPlaneta tipo() {
        return this.tipo;
    }

    public boolean esObservable() {
        return this.esObservable;
    }

    // Enum de tipoPlaneta sin el valor extra
    public enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO;
    }

    // Calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen;  // return densidad calculada del planeta
    }

    // Determina si es un planeta exterior
    public boolean esPlanetaExterior() {
        float limite = (float) (149597870 * 3.4);

        if (distanciaMediaAlsol > limite) {
            return true;
        } else {
            return false;
        }
    }

    // override para imprimir los valores del planeta
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta{");
        sb.append("nombre=").append(nombre);
        sb.append(", cantidadSatelites=").append(cantidadSatelites);
        sb.append(", masa=").append(masa);
        sb.append(", volumen=").append(volumen);
        sb.append(", diametro=").append(diametro);
        sb.append(", distanciaMediaAlsol=").append(distanciaMediaAlsol);
        sb.append(", tipo=").append(tipo);
        sb.append(", esObservable=").append(esObservable);
        sb.append('}');
        return sb.toString();
    }

}
