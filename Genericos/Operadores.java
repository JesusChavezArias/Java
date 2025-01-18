public class Operadores {
    public static void main(String[] JCA){
        //Operadores Básicos: +, -, *, /, %
        int a = 100, b = 50;
        System.out.println("Suma de "+a+" y "+b+" Es: "+(a+b));
        System.out.println("Resta de "+a+" y "+b+" Es: "+(a-b));
        System.out.println("La multiplicacón de "+a+" y "+b+" Es:"+(a+b));
        System.out.println("La división de "+a+" y "+b+" Es: "+(a/b));


         // Operadores Lógicos: &&, ||, !
         boolean x = true, y = false;
         System.out.println("AND LOGICO: "+(x&&y));
         System.out.println("OR LOGICO: "+(x||y));
         System.out.println("NOT LOGICO: "+!(!x));

         operador();
    }
    public static void operador(){
        Object obj = "Hola, Java 17!";
        
        // Usando instanceof mejorado
        if (obj instanceof String s) {
            System.out.println("Longitud de la cadena: " + s.length()+" "+s.hashCode());
        } else {
            System.out.println("El objeto no es una cadena.");
        }
    }
}
