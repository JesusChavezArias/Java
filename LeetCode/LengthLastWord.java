
public class LengthLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        Solution solution = new Solution();

        int resultado = solution.lengthOfLastWord(s);
        System.out.println(resultado);
    }
}


class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() < 1 || s.length() > 10000) return 0;
        StringBuilder ultimaPalabra = new StringBuilder(); 
        if (Character.isLetter(s.charAt(s.length() - 1))) {

        }

        return 0;
    }
}