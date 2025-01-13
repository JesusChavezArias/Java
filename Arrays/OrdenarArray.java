/*
 * Crea un programa que lea 5 números del usuario, los almacene en un array, los ordene y luego imprima el array ordenado.
 */


import java.util.Scanner;
import java.util.Arrays;

public class OrdenarArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner.
        int[] numerosUno; // Declaración del array de enteros
        numerosUno = new int[5]; // Crea un array de 5 elementos


        for(int i=0;i<5;i++){
            System.out.println("Ingresa un número: ");
            numerosUno[i] = scanner.nextInt();  // Leer un número entero.;;
        }
        Arrays.sort(numerosUno);

        System.out.println("Array ordenado: " + Arrays.toString(numerosUno));
        scanner.close();
    }
}
