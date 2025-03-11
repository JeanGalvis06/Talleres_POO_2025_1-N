package Taller6_ModificadorStatic;

public class Carro {
    private String marca;
    private String modelo;
    public static int countCarro = 0;

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        countCarro++; 
    }



    public static void showCounCart() {
        System.out.println("Carro: " + countCarro);
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

    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    public static int getCountCar() {
        return countCarro;
    }

    public static void setCountCar(int countCarro) {
        Carro.countCarro = countCarro;
    }
    
}