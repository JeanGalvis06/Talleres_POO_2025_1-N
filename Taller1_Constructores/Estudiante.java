public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Jose";
        this.edad = 20;
        this.curso = "math";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        String estudiante;
        estudiante = "Estudiante : " + " Nombre: " + this.nombre + ", " +
                " Edad: " + this.edad + ", " + " Curso " + this.curso;

        return estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    
}