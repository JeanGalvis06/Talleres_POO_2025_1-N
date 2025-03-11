package Taller2_UsoDelThis;

public class Producto {
    
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrice(double precio) {
        this.precio = precio;
    }

    public void showProduct() {
        System.out.println("Nombre: " + nombre + ", " + "Precio: " + precio);
    }

}