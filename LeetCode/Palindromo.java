public class Palindromo {
    public static void main(String[] args){
        long x = -121;

        Solution solution = new Solution();

        boolean resultado = solution.isPalindrome(x);
        System.out.println(resultado);
    }

}

class Solution {
    public boolean isPalindrome(long x) {

        if (x < 0) {
            return false;
        } 
        StringBuilder res = new StringBuilder(); 
        String numLetras = String.valueOf(x);

        res.append(numLetras);
        res.reverse();

        System.out.println(res);

        if(numLetras.equals(res.toString()))    
        {
            return true;
        }
        else
        {
            return false;
        }  
    }
}
