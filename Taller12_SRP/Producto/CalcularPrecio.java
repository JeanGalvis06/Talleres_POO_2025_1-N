package Taller12_SRP.Producto;

import java.util.List;

public class CalcularPrecio {

    public double calcularPrecio(List<Producto> productos) {
        var resultado = 0.0;
        for (Producto producto : productos) {
            resultado += producto.getPrecio();
        }

        return resultado;
    }
}