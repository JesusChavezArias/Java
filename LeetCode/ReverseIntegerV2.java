import java.util.Stack;
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range 
[-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned). 
*/
public class ReverseIntegerV2 {
    public static void main(String[] args) {
        int x = -210;
        Solution solution = new Solution();

        int resultado = solution.reverse(x);
        System.out.println(resultado);
    }
}


class Solution {
    public int reverse(int x) {
        //constraints:
        //-2^31 <= x <= 2^31 - 1

        if(x<Integer.MAX_VALUE + 1 || x>Integer.MAX_VALUE || x == 0){
            return 0;
        }
        StringBuilder reverseNumero = new StringBuilder();
        String s = String.valueOf(x);
        
        // Crear una pila
        Stack<Character> pila = new Stack<>();
        
        if(s.charAt(0) == '-'){
          s = s.substring(1);
          
          // Apilar cada carácter de la cadena
          for (char c : s.toCharArray()) {
              pila.push(c);
          }
          while (!pila.isEmpty()) {
              reverseNumero.append(pila.pop());
          }
          reverseNumero.insert(0, '-');         
          
        }else{
          // Apilar cada carácter de la cadena
          for (char c : s.toCharArray()) {
            pila.push(c);
          }
          while (!pila.isEmpty()) {
            reverseNumero.append(pila.pop());
          }
        }

        if (s.charAt(s.length() - 1) == '0') {
          if (reverseNumero.charAt(0) == '0') {
            reverseNumero.deleteCharAt(0); // Elimina el primer carácter (el cero).
          }else if(reverseNumero.charAt(0) == '-' && reverseNumero.charAt(1) == '0'){
            reverseNumero.deleteCharAt(1);
          }
        }
        //System.out.println("Cadena Invertida: " + reverseNumero);
        int x1 = 0;
        try {
            x1 = Integer.parseInt(reverseNumero.toString());
        } catch(Exception e) {
            return 0;
        }

        
        return x1;
    }
}