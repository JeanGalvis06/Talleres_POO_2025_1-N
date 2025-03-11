package Taller5_ModificadorAccesoProtected;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String modelo, String tipo, int cilindrada) {
        super(modelo, tipo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}