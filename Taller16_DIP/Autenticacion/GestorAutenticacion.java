package Taller16_DIP.Autenticacion;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }


    public boolean autenticacion(String usuario, String contraseña) {
        return servicioAutenticacion.autenticacion(usuario, contraseña);
    }

    
}
