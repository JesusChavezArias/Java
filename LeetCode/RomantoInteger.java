/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer. */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class RomantoInteger {
    public static void main(String[] args) {
        String s = "IV";
        Solution solution = new Solution();
        int resultado = solution.romanToInt(s);
        System.out.println(resultado);    
    }
}

class Solution {
    public int romanToInt(String s) {
        String k = "";
        List<Integer> listaEnteros = new ArrayList<>();
        HashMap<Character, Integer> romanValor = new HashMap<>();
        HashSet<Integer> conjuntoVLD = new HashSet<>();
        
        // Insertar los valores correspondientes
        romanValor.put('I', 1);
        romanValor.put('V', 5);
        romanValor.put('X', 10);
        romanValor.put('L', 50);
        romanValor.put('C', 100);
        romanValor.put('D', 500);
        romanValor.put('M', 1000);
        
        //System.out.println(s.length());

        if (s.length() < 1 || s.length() > 15) {
            return 0;
        }

        // Iterar sobre cada carácter de la cadena s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Si el carácter no está en el mapa romanValor, devolver 0 (carácter no válido)
            if (!romanValor.containsKey(c)) {
                return 0;
            }
        }
        for(Character letra : s.toCharArray()){
          //Integer valor = romanValor.get(letra);
          listaEnteros.add(romanValor.get(letra));
        }
        System.out.println(listaEnteros);
        //V, L, D
        for (int i = 0; i < listaEnteros.size(); i++) {
            
        }

        return 1;
    }
}