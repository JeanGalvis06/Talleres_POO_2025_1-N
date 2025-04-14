package Taller16_DIP;

import Taller16_DIP.Autenticacion.AutenticacionLocal;
import Taller16_DIP.Autenticacion.AutenticacionOAuth;
import Taller16_DIP.Autenticacion.GestorAutenticacion;
import Taller16_DIP.Autenticacion.ServicioAutenticacion;
import Taller16_DIP.Almacenamiento.AlmacenamientoLocal;
import Taller16_DIP.Almacenamiento.GestorArchivos;
import Taller16_DIP.Almacenamiento.Almacenamiento;

public class Main {
    public static void main(String[] args) {
        //Auth
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        System.out.println(gestorAutenticacion.autenticacion("Jean", "12345"));


        ServicioAutenticacion authO = new AutenticacionOAuth();
        GestorAutenticacion gestorAutenticacion2 = new GestorAutenticacion(authO);
        System.out.println(gestorAutenticacion2.autenticacion("joaksu", "32421323"));



        //Storagee
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoLocal);
        gestorArchivos.crearArchivo("nuevo archivo");
        gestorArchivos.recuperarArchivo("Nuevo archivo");

    }
}
