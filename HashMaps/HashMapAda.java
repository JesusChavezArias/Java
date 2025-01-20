import java.util.HashMap;
import java.util.Map;

public class HashMapAda {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("Manzanas", 10);
        inventario.put("Naranjas", 5);
        inventario.put("Peras", 7);

        // Iterar con entrySet()
        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println("Producto: " + entrada.getKey() + ", Cantidad: " + entrada.getValue());
        }
    }
}
