package Taller7_ClasesAbstractas;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea () {
        System.out.println(calcularArea());
    }
}