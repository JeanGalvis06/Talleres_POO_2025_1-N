package Taller16_DIP.Almacenamiento;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void crearArchivo(String file) {
        almacenamiento.guardarArchivo(file);
    }

    public void recuperarArchivo(String file) {
        almacenamiento.recuperar(file);
    }
}
