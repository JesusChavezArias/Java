public class LongestPalindrome {
    public static void main(String[] args){
        String s = "babad";

        Solution solution = new Solution();

        String resultado = solution.longestPalindrome(s);
        System.out.println(resultado);
    }

}

//Mi solucion "Horrenda" n(O^3)
/* 
class Solution {
    public String longestPalindrome(String s) {
        
        if (s.length() == 0) {
            return "";
        }
        
        String txt = ""; // Almacenar el palíndromo más largo
        
        for (int i = 0; i < s.length(); i++) {
            StringBuilder palindromo = new StringBuilder(); // Reiniciar el StringBuilder en cada iteración
            
            for (int j = i; j < s.length(); j++) {
                // Agregar el char actual al palindromo en construcción
                palindromo.append(s.charAt(j));
                String current = palindromo.toString();

                // Verificar la subcadena actual 
                if (current.equals(new StringBuilder(current).reverse().toString())) {
                    // Actualizar el texto 
                    if (current.length() > txt.length()) {
                        txt = current;
                    }
                }
            }
        }
        
        return txt;
    }
}
*/
//Implementación del algoritmo de Manacher n(O):
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        // Convertir la cadena para manejar palíndromos de longitud impar y par
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("#");
            
        }
        //System.out.println(sb);
        // Inicializar el arreglo de longitudes de palíndromos y variables para el centro y el límite derecho
        int n = sb.length();
        int[] p = new int[n];  // Arreglo de longitud del palíndromo centrado en cada índice
        int c = 0, r = 0;  // Centro y límite derecho del palíndromo más grande encontrado

        for (int i = 0; i < n; i++) {
            int mirror = 2 * c - i;  // Espejo de i con respecto al centro c

            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);  // Usar el valor del palíndromo en el espejo si está dentro del límite
            }

            // Intentar expandir el palíndromo centrado en i
            while (i + p[i] + 1 < n && i - p[i] - 1 >= 0 && sb.charAt(i + p[i] + 1) == sb.charAt(i - p[i] - 1)) {
                p[i]++;
            }

            // Actualizar el centro y el límite derecho si es necesario
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
        }

        // Encontrar el palíndromo más largo
        int maxLen = 0, centerIndex = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // El palíndromo está entre centerIndex - maxLen y centerIndex + maxLen
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
