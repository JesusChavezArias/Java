import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IfStatement {
    public static void main(String[] x) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }

        System.out.print("Ingresa la temperatura actual: ");
        int temperatura = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.


        if (temperatura > 25) {
            System.out.println("Hace calor.");
        } else {
            System.out.println("El clima está agradable.");
        }

        System.out.print("Ingresa tu calificacion: ");
        int nota = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.


        if (nota >= 90) 
        {
            System.out.println("Excelente.");
        } 
        else if (nota >= 85) 
        {
            System.out.println("Felicidades.");
        } 
        else if (nota >= 70) 
        {
            System.out.println("Aprobado.");
        }
        else 
        {
            System.out.println("Reprobado.");
        }
    }
}
