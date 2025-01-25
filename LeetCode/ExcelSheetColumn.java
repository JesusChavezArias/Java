/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

  */
public class ExcelSheetColumn {
    public static void main(String[] args) {
        // Crear una instancia de la clase Solution
        Solution solution = new Solution();
        String columnTitle = "AB";
        
        int result = solution.titleToNumber(columnTitle);
        System.out.println("El número de la columna '" + columnTitle + "' es: " + result);
    }
}

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
