package Taller13_OCP.Descuento;

public class ProcentajeDescuento  extends Descuento{

    @Override
    public double procesoDescuento(double descuento) {
        if ( descuento > 0 && descuento <= 100) {
            return descuento * (descuento/100);
        }
        System.out.println("descuento no valido");
        return 0.0;
    }

}