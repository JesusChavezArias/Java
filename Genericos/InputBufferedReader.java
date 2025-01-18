/*
 * ¿Qué es? Es una clase de Java que permite leer texto de un flujo de entrada (como el teclado) de forma eficiente.

    ¿Cómo funciona? Es más rápido que Scanner para leer grandes cantidades de datos, pero requiere manejo adicional para convertir las entradas en tipos específicos.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;

public class InputBufferedReader {
    public static void main(String[] x) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa tu nombre: ");
        String nombre = reader.readLine();  // Leer una línea completa.

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.

        //System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        System.out.print("Ingresa tu salario pls!: ");
        int salario = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.

        System.out.println("Hola, "+nombre+" Tienes una edad de "+edad+" y tienes aparentemente un sueldo de: "+salario);
    }    
}
