package Taller7_ClasesAbstractas;

public class Vendedor extends Empleado{
    private double bono;
    private final double salario = 15000;

    public Vendedor(double bono) {
        this.bono = bono;
    }



    @Override
    public double calcularSalario() {
        if (bono == 0) {
            System.out.println("El vendedor no contiene bono");
        }

        return bono * salario;
    }
    
}