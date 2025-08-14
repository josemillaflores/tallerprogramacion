package tallerutpjava;

public class variables2 {
   public static void main(String[] args) {
          System.out.println("--- TIPOS DE DATOS PRIMITIVOS ---");
        System.out.println("Estos son los tipos de datos más básicos en Java. No son objetos.\n");

        // --- Tipos de datos para números enteros ---

        // byte: Almacena números enteros muy pequeños. Es útil para ahorrar memoria.
        // Tamaño: 8 bits | Rango: -128 a 127
        byte edadPersona = 25;
        System.out.println("byte: " + edadPersona + " (Para enteros pequeños, ahorra memoria)");

        // short: Almacena números enteros cortos.
        // Tamaño: 16 bits | Rango: -32,768 a 32,767
        short anioFabricacion = 2023;
        System.out.println("short: " + anioFabricacion + " (Para enteros cortos)");

        // int: El tipo de dato entero más común y utilizado por defecto.
        // Tamaño: 32 bits | Rango: -2,147,483,648 a 2,147,483,647
        int salarioAnual = 50000;
        System.out.println("int: " + salarioAnual + " (El entero más común)");

        // long: Para números enteros muy grandes. Se debe añadir una 'L' al final del número.
        // Tamaño: 64 bits | Rango: muy grande
        long poblacionMundial = 8000000000L;
        System.out.println("long: " + poblacionMundial + " (Para enteros muy grandes, requiere 'L' al final)");

        System.out.println(); // Línea en blanco para separar

        // --- Tipos de datos para números de punto flotante (con decimales) ---

        // float: Para números decimales de precisión simple. Requiere una 'f' al final.
        // Tamaño: 32 bits
        float precioProducto = 19.99f;
        System.out.println("float: " + precioProducto + " (Para decimales, requiere 'f' al final)");

        // double: Para números decimales de doble precisión. Es el más usado para decimales.
        // Tamaño: 64 bits
        double pi = 3.14159265359;
        System.out.println("double: " + pi + " (Para decimales con mayor precisión, es el más común)");

        System.out.println(); // Línea en blanco para separar

        // --- Otros tipos primitivos ---

        // boolean: Almacena un valor de verdadero (true) o falso (false).
        // Se utiliza para tomar decisiones en el código.
        boolean esEstudiante = true;
        System.out.println("boolean: " + esEstudiante + " (Solo puede ser 'true' o 'false')");

        // char: Almacena un único carácter. Se define con comillas simples ''.
        // Tamaño: 16 bits (Unicode)
        char inicialNombre = 'J';
        System.out.println("char: " + inicialNombre + " (Para un solo carácter, usa comillas simples)");

        System.out.println("\n--- TIPO DE DATO DE REFERENCIA (Objeto) ---");
        System.out.println("A diferencia de los primitivos, estos son objetos que tienen métodos.\n");

        // String: Almacena una secuencia de caracteres (texto). No es un tipo primitivo, es una clase.
        // Se define con comillas dobles "".
        String saludo = "¡Hola, desarrollador de Java!";
        System.out.println("String: \"" + saludo + "\" (Para texto, usa comillas dobles)");

        System.out.println("\n--- Resumen ---");
        System.out.println("Elegir el tipo de variable correcto es importante para la eficiencia de la memoria y la precisión de los datos.");
    }

}
