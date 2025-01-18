/*
    Descripción:
    Escribe un programa que lea tres números enteros del usuario y determine si:

    Al menos uno de los números es positivo.
    Todos los números son negativos.
    Solo uno de los números es par.
 */
import java.util.Scanner;
public class EjerOperador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer tres números del usuario
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = scanner.nextInt();


        boolean alMenosUnoPositivo = false;
        boolean todosNegativos = false;
        boolean soloUnoPar = false;
        // Determinar si al menos uno de los números es positivo
        alMenosUnoPositivo = (num1 > 0 || num2 > 0 || num3 > 0);
        todosNegativos = (num1 < 0 && num2 < 0 && num3 < 0);
        soloUnoPar = ((num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 != 0) ||
                      (num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 != 0) ||
                      (num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 == 0));

        System.out.println("¿Al menos uno es positivo?: " + alMenosUnoPositivo);
        System.out.println("¿Todos son negativos?: " + todosNegativos);
        System.out.println("¿Solo uno es par?: " + soloUnoPar);

        scanner.close();
    }
}
