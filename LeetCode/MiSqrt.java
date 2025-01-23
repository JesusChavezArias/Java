//Implementacion de Newton-Raphson
//f(x)=x^2−a
/*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
    The returned integer should be non-negative as well.

    You must not use any built-in exponent function or operator.

    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
*/

public class MiSqrt {
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
      
      double x = 0.0f;
      double tolerancia = 0.000001f;
      
      x = a/2;
      
      while(true){
        double x_1 = (x+a/x)/2;
        if(Math.abs(x - x_1) < tolerancia){
          int redondeado = (int) Math.floor(x_1);
          return redondeado;
        }
        x = x_1;
      }
    }
}