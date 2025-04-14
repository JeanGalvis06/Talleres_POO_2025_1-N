package Taller4_1_ModificadorAccesoPublico;

public class Empleado {
    public String nombre;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario == 0) {
            System.out.println("El valor no se puede modificar");
        } else {
            this.salario = salario;
        }
    }

}