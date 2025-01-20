import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<Integer, String> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        mapa.put(1, "Manzana");
        mapa.put(2, "Pera");
        mapa.put(3, "Naranja");

        // Imprimir el mapa
        System.out.println("HashMap: " + mapa);

        // Obtener un valor por su clave
        String fruta = mapa.get(1);
        System.out.println("Fruta en clave 1: " + fruta);

        // Verificar si contiene una clave o valor
        System.out.println("¿Contiene clave 2? " + mapa.containsKey(2));
        System.out.println("¿Contiene 'Naranja'? " + mapa.containsValue("Naranja"));

        // Eliminar un elemento
        mapa.remove(2);
        System.out.println("Después de eliminar clave 2: " + mapa);

        // Iterar sobre el HashMap
        System.out.println("Iterando sobre el HashMap:");
        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
    }
}
