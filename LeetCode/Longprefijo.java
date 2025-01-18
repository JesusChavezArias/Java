public class Longprefijo {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Solution solution = new Solution();

        String resultado = solution.longestCommonPrefix(strs); // Aquí corregí el nombre del método.
        System.out.println("Prefijo común más largo: " + resultado);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) { // Nombre corregido.
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefijo = strs[0]; // Usa el primer elemento como base del prefijo.

        for (int i = 1; i < strs.length; i++) {
            // Reduce el prefijo mientras no sea un prefijo válido de strs[i].
            while (!strs[i].startsWith(prefijo)) {
                prefijo = prefijo.substring(0, prefijo.length() - 1);
                // Si el prefijo queda vacío, no hay prefijo común.
                if (prefijo.isEmpty()) {
                    return "";
                }
            }
        }

        return prefijo; 
    }
}
