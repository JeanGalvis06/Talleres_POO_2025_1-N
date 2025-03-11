package Taller3_ModificadorAccesoPaquete;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

   
    void showInfo() {
        System.out.println("Nombre: " + nombre + " Precio: " + " Stock: " + stock);
    }

     
}
