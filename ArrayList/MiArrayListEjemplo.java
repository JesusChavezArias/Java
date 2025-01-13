/*
 * Un ArrayList es una clase de la colección estándar de Java que proporciona una lista dinámica. 
 * A diferencia de los arrays tradicionales, los ArrayList pueden cambiar de tamaño automáticamente cuando se agregan o eliminan elementos. 
 * Es una implementación de la interfaz List de Java y pertenece al paquete java.util.
 */
import java.util.ArrayList;

public class MiArrayListEjemplo {
    public static void main(String[] x) {
        
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Obtener y mostrar elementos
        System.out.println("Primera fruta: " + frutas.get(0));

        // Actualizar un elemento
        frutas.set(1, "Cereza");
        System.out.println("Frutas actualizadas: " + frutas);

        // Eliminar un elemento
        frutas.remove("Naranja");
        System.out.println("Frutas después de eliminar: " + frutas);

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + frutas.size());

        // Verificar si contiene un elemento
        System.out.println("¿Contiene 'Manzana'? " + frutas.contains("Manzana"));

        // Recorrer la lista
        System.out.println("Frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Vaciar la lista
        frutas.clear();
        System.out.println("¿La lista está vacía? " + frutas.isEmpty());


    }
}
