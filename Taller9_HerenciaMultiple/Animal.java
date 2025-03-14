package Taller9_HerenciaMultiple;

public class Animal implements Volador, Nadador {

    @Override
    public void volar() {
       System.out.println("El animal vuela");
    }

    @Override
    public void nadar() {
        System.out.println("El animal nada");
    }
    
}