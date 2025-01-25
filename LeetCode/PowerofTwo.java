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

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 536870912;
        Solution solution = new Solution();
        boolean resultado = solution.isPowerOfTwo(n);
        System.out.println(resultado);
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<Integer.MAX_VALUE + 1 || n>Integer.MAX_VALUE){
            return false;
        }
        if (n <= 0) {
            return false; // Los números negativos y cero no son potencias de 2
        }
        double log2 = Math.log(n) / Math.log(2); // Logaritmo en base 2
        System.out.println(Math.floor(log2));
        return Math.abs(log2 - Math.round(log2)) < 1e-10; // Compara con tolerancia
    }
}