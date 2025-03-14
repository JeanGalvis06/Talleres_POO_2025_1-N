package Taller7_ClasesAbstractas;

public class Gerente extends Empleado {
    private final double salario = 10000;

    @Override
    public double calcularSalario() {
        return salario;
    }

    
}