# Proyecto de Java - Conceptos y Ejemplos Básicos

Este repositorio contiene ejemplos y explicaciones básicas sobre Java, enfocados en aspectos fundamentales del lenguaje y el manejo de entrada del usuario. Está diseñado como una guía práctica para repasar conceptos esenciales y aprender a aplicarlos en programas simples.

## Requisitos Previos
- **Java Development Kit (JDK)**: Asegúrate de tener instalado Java 17 o una versión superior.
- **Editor de Código**: Usa un IDE como IntelliJ, Eclipse o un editor de texto como Visual Studio Code o Notepad++.
- **Consola/Terminal**: Para compilar y ejecutar programas desde la línea de comandos.

## Cómo Ejecutar los Programas

1. Navega al directorio donde están los archivos `.java`:
   ```bash
   cd ruta/a/tu/repo/Java
   ```

2. Compila los archivos Java:
   ```bash
   javac NombreArchivo.java
   ```

3. Ejecuta el archivo compilado:
   ```bash
   java NombreArchivo
   ```

## Conceptos Clave

### Entrada de Usuario en Java
En Java, puedes capturar la entrada del usuario mediante varias clases. A continuación, un resumen:

#### **1. Scanner**
Clase básica para capturar diferentes tipos de datos desde la consola.

**Ejemplo:**
```java
import java.util.Scanner;

public class InputEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        scanner.close();
    }
}
```

#### **2. Console**
Método más seguro para capturar datos sensibles, como contraseñas.

**Ejemplo:**
```java
import java.io.Console;

public class EjemploConsole {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No se pudo obtener la consola.");
            return;
        }

        char[] password = console.readPassword("Ingresa tu contraseña: ");
        System.out.println("Contraseña ingresada correctamente.");
    }
}
```

### Manejo de Excepciones
En Java, las excepciones se utilizan para manejar errores en tiempo de ejecución. Por ejemplo, al leer datos desde la consola, podrías encontrarte con una `IOException`.

**Ejemplo con throws:**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjemploIOException {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa tu nombre: ");
        String nombre = reader.readLine();

        System.out.println("Hola, " + nombre);
    }
}
```

**Ejemplo con try-catch:**
```java
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Ingresa tu nombre: ");
    String nombre = reader.readLine();
    System.out.println("Hola, " + nombre);
} catch (IOException e) {
    System.out.println("Error al leer la entrada.");
}
```

### Lambdas
Las expresiones lambda son una forma concisa de representar funciones anónimas.

**Ejemplo:**
```java
import java.util.List;
import java.util.Arrays;

public class EjemploLambda {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Luis");

        nombres.forEach(nombre -> System.out.println("Hola, " + nombre));
    }
}
```

### Mapas
Un `Map` es una estructura de datos que almacena pares clave-valor.

**Ejemplo:**
```java
import java.util.HashMap;

public class EjemploMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Uno");
        mapa.put(2, "Dos");

        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}
```

## Organización de los Archivos
- `InputEjemplo.java`: Ejemplo básico con `Scanner`.
- `EjemploConsole.java`: Entrada segura con `Console`.
- `EjemploIOException.java`: Manejo de excepciones con entrada de datos.
- `EjemploLambda.java`: Uso de expresiones lambda.
- `EjemploMap.java`: Trabajo con mapas.

## Contribuciones
Si quieres mejorar este repositorio o agregar más ejemplos, ¡sientete libre de hacer un pull request!

---

¡Gracias por explorar este repositorio! Si tienes dudas o comentarios, no dudes en abrir un issue.

