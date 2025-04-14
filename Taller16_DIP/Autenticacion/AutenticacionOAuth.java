package Taller16_DIP.Autenticacion;

public class AutenticacionOAuth implements ServicioAutenticacion{

    @Override
    public boolean autenticacion(String usuario, String contraseña) {
        return "Usuario autorizado".equals(usuario) && "Contraseña autorizada".equals(contraseña);
    }

    
} 