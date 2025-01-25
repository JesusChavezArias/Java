/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:

Input: n = 3
Output: false

 

Constraints:

    -231 <= n <= 231 - 1
 */

public class PowerofTwoV2 {
    public static void main(String[] args) {
        int n = 536870912;
        Solution solution = new Solution();
        boolean resultado = solution.isPowerOfTwo(n);
        System.out.println(resultado);
    }
}

class Solution {
    /**
     * Método para verificar si un número es una potencia de dos.
     * Un número es potencia de dos si tiene solo un bit '1' en su representación binaria.
     * @param n El número a verificar
     * @return true si n es una potencia de dos, false de lo contrario
     */
    public boolean isPowerOfTwo(int n) {
        // Un número es potencia de dos si es mayor que 0 y su representación binaria 
        // tiene solo un '1', lo que significa que n & (n - 1) debe ser 0.
        if (n <= 0) {
            return false; // Cualquier número no positivo no es una potencia de dos
        }
        return (n & (n - 1)) == 0; // Verificamos si solo tiene un '1' en su representación binaria
    }
}