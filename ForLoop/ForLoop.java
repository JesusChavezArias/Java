//

public class ForLoop {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Definición del array

        // Bucle for-each para recorrer el array
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) continue; // Salta cuando i es 5
            System.out.println("i: " + i);
        }
        

        salir:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) break salir; // Rompe ambos bucles
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) break; // Sale del bucle cuando i es 5
            System.out.println("i: " + i);
        }
        

    }
}
