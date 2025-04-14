package Taller13_OCP.Descuento;

public class GenerarDescuento {
    
    public double generarDescuento(Descuento descuentoTipico, double descuento) {
        return descuentoTipico.procesoDescuento(descuento);
    }
}
