package Taller5_ModificadorAccesoProtected;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    protected void showInfo() {
        System.out.println("Nombre: " + nombre + "," + " Salario: " + salario);
    }
}