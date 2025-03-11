import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // CUENTA BANCARIA
            System.out.println("Ingresar numero de cuenta: ");
            var numeroCuenta = sc.nextLine();
            System.out.println("Ingresar el saldo: ");
            var saldo = sc.nextDouble();
            System.out.println("Igresar tipo de cuenta: ");
            var tipoCuenta = sc.nextLine();
            var cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);


            // LIBRO
            System.out.println("Ingresar titulo del libro: ");
            var titulo = sc.nextLine();
            System.out.println("Igresar autor: ");
            var autor = sc.nextLine();
            System.out.println("ingresar numero de paginas: ");
            var numeroPaginas = sc.nextInt();
            var libro = new Libro(titulo, autor, numeroPaginas);


            // ESTUDIANTE
            System.out.println("Igresar nombre de estudiante: ");
            var nombre = sc.nextLine();
            System.out.println("Ingresar edad: ");
            var edad = sc.nextInt();
            System.out.println("Ingresar curso: ");
            var curso = sc.nextLine();
            var estudiante = new Estudiante(nombre, edad, curso);


            System.out.println(cuentaBancaria);
            System.out.println(libro);
            System.out.println(estudiante);
        }        
    }
}