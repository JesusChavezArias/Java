//Busqueda Binaria
/*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
    The returned integer should be non-negative as well.

    You must not use any built-in exponent function or operator.

    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
*/

public class MiSqrtV2 {
    public static void main(String[] args) {
        int x = 2147395599;
        Solution solution = new Solution();

        int resultado = solution.mySqrt(x);
        System.out.println(resultado);    
    }
}

class Solution {
    public int mySqrt(int a) {
      
      if(a<=0){
          return 0;
      }else if(a == 1){
        return 1;
      }
      
       double min = 0.0;
       double max = a;
       double tolerancia = 0.000001f;
       double mid = (min + max) / 2;
      
      while (Math.abs(mid * mid - a) > tolerancia) {
        if (mid * mid > a) {
            max = mid;
        } else {
            min = mid;
        }
        mid = (min + max) / 2;
      }
      int redondeado = (int) Math.floor(mid);
      return redondeado;
    }
}