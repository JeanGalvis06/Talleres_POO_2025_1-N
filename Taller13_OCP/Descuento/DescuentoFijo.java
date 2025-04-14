package Taller13_OCP.Descuento;

public class DescuentoFijo extends Descuento {

    @Override
    public double procesoDescuento(double descuento) {
        return descuento * 0.05;   
    }
    
}
