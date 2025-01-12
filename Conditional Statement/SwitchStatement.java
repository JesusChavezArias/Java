import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwitchStatement {
    public static void main(String[] x) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el dia de la semana (coin Numeros 1-7): ");
        int dia = Integer.parseInt(reader.readLine());  // Convertir la entrada a entero.


        switch (dia) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        
        case 7:
            System.out.println("Domingo");
            break;

        default:
            System.out.println("Día no válido");

        }
    }
}