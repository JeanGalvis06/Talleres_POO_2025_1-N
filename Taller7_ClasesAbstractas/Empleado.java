package Taller7_ClasesAbstractas;

public abstract class Empleado {
    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("El salario es: " + calcularSalario());
    }
}