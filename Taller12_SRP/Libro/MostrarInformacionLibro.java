package Taller12_SRP.Libro;

public class MostrarInformacionLibro {
    
    public void mostrarInformacionLibro(Libro libro) {
        System.out.println("Nombre: " + libro.getNombre() + ", " + "Disponible: " + libro.getDisponible());
    }
}