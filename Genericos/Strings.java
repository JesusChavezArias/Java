/*
 * En Java, las cadenas de texto se representan mediante la clase String, que permite almacenar y manipular secuencias de caracteres. 
 * Las cadenas son inmutables, lo que significa que una vez creadas, su valor no puede cambiar. 
 * Esta inmutabilidad facilita la gestión de cadenas y mejora la seguridad en aplicaciones concurrentes.
 */

public class Strings {
    public static void main(String[] args) {
        String multilinea = "Línea 1\nLínea 2\nLínea 3";
        multilinea.lines().forEach(System.out::println);

        String saludo = "Hola! ";
        String repetido = saludo.repeat(3); // "Hola! Hola! Hola! "
        System.out.println(repetido);

        String texto = "   Java 17   ";
        String sinEspacios = texto.strip(); // "Java 17"
        System.out.println(sinEspacios);

        /*
         * Una mejora notable en Java 17 es la optimización del método String.format(), que ahora es aproximadamente tres veces más rápido que 
         * en versiones anteriores. Este método permite construir cadenas complejas de manera conveniente.
         */
        String nombre = "Java";
        int version = 17;
        String mensaje = String.format("Bienvenido a %s versión %d", nombre, version);
        System.out.println(mensaje); // "Bienvenido a Java versión 17"

        String bloqueTexto = """
            Línea 1
            Línea 2
            Línea 3
            """;
        System.out.println(bloqueTexto);

    }
}
