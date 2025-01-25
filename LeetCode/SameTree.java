/*
  Given the roots of two binary trees p and q, write a function to check if they are the same or not.
  Two binary trees are considered the same if they are structurally identical, and the nodes have the same value. 
*/

// Definición de la clase TreeNode (para representar el nodo del árbol binario)
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  // Constructor sin parámetros
  TreeNode() {}

  // Constructor con valor
  TreeNode(int val) {
      this.val = val;
  }

  // Constructor con valor y nodos hijos
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

public class SameTree {

  public static void main(String[] uwu) {
      // Crear el árbol 1 (p)
      TreeNode nodo2 = new TreeNode(2); // Nodo con valor 2
      TreeNode nodo3 = new TreeNode(3); // Nodo con valor 3
      TreeNode raiz1 = new TreeNode(1, nodo2, nodo3); // Nodo raíz con valor 1

      // Crear el árbol 2 (q) con la misma estructura
      TreeNode nodo2q = new TreeNode(2); // Nodo con valor 2
      TreeNode nodo3q = new TreeNode(3); // Nodo con valor 3
      TreeNode raiz2 = new TreeNode(1, nodo2q, nodo3q); // Nodo raíz con valor 1

      // Crear la instancia de la clase Solution
      Solution solution = new Solution();

      // Llamar al método isSameTree con los árboles creados
      boolean resultado = solution.isSameTree(raiz1, raiz2);

      // Imprimir el resultado
      System.out.println("¿Son los árboles iguales? " + resultado);  // Debería imprimir true
  }
}

// Clase que contiene el método isSameTree
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
          return true;  // Ambos son null, son iguales
      }
      if (p == null || q == null) {
          return false;  // Uno de ellos es null, no son iguales
      }
      
      // Comparar valores y hacer llamadas recursivas para los subárboles izquierdo y derecho
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
