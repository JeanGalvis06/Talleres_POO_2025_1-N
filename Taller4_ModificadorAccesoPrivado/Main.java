package Taller4_ModificadorAccesoPrivado;

public class Main {
    

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Jose", 20, 4.3);
        Carro carro = new Carro("Audi", "232nnmd", 250);

        System.out.println("Velocidad Maxima: " + carro.getVelocidadMaxima());

        carro.aceleracion(100);

        System.out.println("Velocidad Maxima: " + carro.getVelocidadMaxima());


        System.err.println("Nombre: " + estudiante1.getNombre());
        
    }

}