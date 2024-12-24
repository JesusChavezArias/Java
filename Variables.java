public class Variables {
    public static void main(String[] args) {
        //Integer Type of Variables
        byte aSingleByte = 100; //-128 to 127
        short aSmallNumber = 1000; //-32,768 to 32,767
        int aInteger = 1; //-2,147,483,648 to 2,147,483,647
        long aLongNumber = 1000000000000000000L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //  Floating Point Type of Variables
        double aDouble = 1.0; // 4.9e-324 to 1.8e+308
        float aFloat = 1.0f; // 1.4e-045 to 3.4e+038

        //bolean Type of Variables (Verdadero o Falso)
        boolean aBoolean = true;
        boolean aBooleanF = false;

        //Character Type of Variables
        char aChar = 'A'; // '\u0000' to '\uffff'
        
        //Impresion de Variables
        System.out.println("byte: " + aSingleByte +
                            "\nNumero Pequeño (Short): " + aSmallNumber +
                            "\nNumero Entero (Int): " + aInteger +
                            "\nNumero Largo (Long): " + aLongNumber);
        
        System.out.println("\nFlotante doble: " + aDouble +
                            "\nFlotante: " + aFloat);
                            
        System.out.println("\nBoleano V: " + aBoolean +
                            "\nBoleano F: " + aBooleanF);
                            
        System.out.println("\nChar: " + aChar);                  
    }
}
