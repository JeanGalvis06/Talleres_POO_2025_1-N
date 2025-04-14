package Taller16_DIP.Almacenamiento;

public class AlmacenamientoNube  implements Almacenamiento{
    
    @Override
    public void guardarArchivo(String archivo) {
        System.out.println("Archivo : " + archivo + "Guardado exitosamente");
    }

    @Override
    public void recuperar(String archivo) {
        System.out.println("Archivo: " + archivo + "Recuperado exitosamente");
    }
}
