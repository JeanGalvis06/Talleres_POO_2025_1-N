package Taller4_1_ModificadorAccesoPublico;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria() {
    }

    

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }


    public void mostrarInformacion(){
        System.out.println("Numero de cuenta: " + numeroCuenta + ", " + "saldo: " + saldo + ", " + "type Account" + tipoCuenta);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}