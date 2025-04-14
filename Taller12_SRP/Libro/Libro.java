package Taller12_SRP.Libro;

public class Libro {
    
    private String nombre;
    private String autor;
    private Boolean disponible;

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.disponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }


    

    

}