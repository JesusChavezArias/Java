/*
    ¿Qué es? La clase Console proporciona métodos para leer datos desde la consola. Es útil en aplicaciones que no se ejecutan en entornos IDE (como Eclipse), donde System.console() puede devolver null.

    ¿Cómo funciona? Se utiliza para leer entradas de forma segura, especialmente contraseñas.
 */


public class InputConsole {
    public static void main(String[] x) {
        
        java.io.Console console = System.console();

        if (console != null) {
            String nombre = console.readLine("Ingresa tu nombre: ");  // Leer texto.
            char[] password = console.readPassword("Ingresa tu contraseña: ");  // Leer contraseña.

            System.out.println("Hola, " + nombre + ". Tu contraseña tiene " + password.length + " caracteres.");
        } else {
            System.out.println("La consola no está disponible.");
        }

    }
}
