/*
 * ¿Qué es? Es una clase en el paquete javax.swing que permite mostrar cuadros de diálogo para recibir entradas del usuario.

    ¿Cómo funciona? Es útil para aplicaciones gráficas donde no se desea usar la consola.
 */

import javax.swing.JOptionPane;

public class InputJOptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");  // Solicitar un valor.
        String edadStr = JOptionPane.showInputDialog("Ingresa tu edad: ");
        int edad = Integer.parseInt(edadStr);  // Convertir a entero.

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". Tienes " + edad + " años.");
    
    }
}
