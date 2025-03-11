package Taller4_ModificadorAccesoPrivado;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante() {
      
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this(nombre, edad);
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        String estudiante;
        estudiante = "Estudiante : " + " Nombre: " + this.nombre + ", " +
                " Edad: " + this.edad + ", " + " Nota Promedio: " + this.notaPromedio;

        return estudiante;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getedad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void getNotaPromedio(int notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    
}