package Taller4_ModificadorAccesoPrivado;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Carro() {
    }

    public Carro(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setMaxSpeed(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public void aceleracion(int acc) {
        if (acc < 0) {
            System.out.println("Acelerar debe ser positiva");
        } else {
            velocidadMaxima += acc;
        }
    }
    
}