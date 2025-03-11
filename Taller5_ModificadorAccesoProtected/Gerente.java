package Taller5_ModificadorAccesoProtected;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }


    public void showinformation() {
        showInfo();
        System.out.println("Departamento: " + departamento);
    }
    
}