import java.util.Random;


public class Arrays {
    public static void main(String[] args) {
        // Declaración de arrays
        int[] numeros; // Declaración del array de enteros
        String[] nombres; // Declaración del array de cadenas
        
        // Inicialización de arrays
        numeros = new int[5]; // Crea un array de 5 elementos
        nombres = new String[3]; // Crea un array de 3 cadenas

        // Asignación de valores al array de números
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Asignación de valores al array de nombres
        nombres[0] = "Alice";
        nombres[1] = "Bob";
        nombres[2] = "Charlie";

        // Imprimir los valores de los arrays
        System.out.println("Array de números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Array de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int[] numerosDos; // Declaración del array de enteros
        
        // Inicialización de arrays
        numerosDos = new int[5]; // Crea un array de 5 elementos
        
        Random rand = new Random();

        int rand_int1 = 0;

        for(int j = 0; j < numerosDos.length; j++){
            numeros[j] = rand_int1 = rand.nextInt(1000);
            System.out.println("El numero en la posicion "+j+" se generó un numero aleatorio de: "+numeros[j]);
        }


    }
}
