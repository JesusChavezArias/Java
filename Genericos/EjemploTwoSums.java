public class EjemploTwoSums{
    public static void main(String[] x){
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();

        // Llamar al método twoSum
        int[] result = solution.twoSum(nums, target);

        // Imprimir el resultado
        if (result != null) {
            System.out.println("Indices encontrados: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No se encontraron índices.");
        }

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Implementación del método
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null; // Si no se encuentran índices
    }
}