package Taller8y8_1_HerenciaSimple;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jean Galvis", 50000);
        empleado.mostrarDetalles();

        Gerente gerente = new Gerente("Ana García", 5000, "Gerencia");
        gerente.mostrarDetalles();
    }
}