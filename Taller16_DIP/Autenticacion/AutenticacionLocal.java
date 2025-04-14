package Taller16_DIP.Autenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticacion(String usuario, String contraseña) {
        return "jean".equals(usuario) && "12345".equals(contraseña);
    }
    
}
