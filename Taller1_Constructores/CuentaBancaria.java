public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        String cuentaBancaria;
        cuentaBancaria = "Cuenta Bancaria: " + " Numero de Cuenta: " + this.numeroCuenta + ", " +
                " Saldo: " + this.saldo + ", " + " Tipo de Cuenta: " + this.tipoCuenta;

        return cuentaBancaria;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAccountType() {
        return tipoCuenta;
    }

}