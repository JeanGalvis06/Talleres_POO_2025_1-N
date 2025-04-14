package Taller16_DIP.Almacenamiento;

public class AlmacenamientoLocal  implements Almacenamiento {

    @Override
    public void guardarArchivo(String archivo) {
        System.out.println("Archivo : " + archivo + "Guardado");
    }

    @Override
    public void recuperar(String archivo) {
        System.out.println("Archivo: " + archivo + "Recuperado");
    }
    
}
