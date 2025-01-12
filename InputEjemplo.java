import java.util.Scanner;

public class InputEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner.

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  // Leer una línea completa.

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();  // Leer un número entero.

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        System.out.println("Ingresa tu salario por favor!: ");
        Integer salario = scanner.nextInt();

        System.out.println("Hola, "+nombre+" Tienes una edad de "+edad+" y tienes aparentemente un sueldo de: "+salario);




        scanner.close();  // Cerrar el Scanner (buena práctica).
    }
}
