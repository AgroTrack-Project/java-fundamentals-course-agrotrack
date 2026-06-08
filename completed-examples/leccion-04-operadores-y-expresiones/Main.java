public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // Operadores aritméticos
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));

        // Operadores relacionales
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a < b: " + (a < b));

        // Operadores lógicos
        boolean esMayor = a > 10;
        boolean esPar = a % 2 == 0;
        System.out.println("Es mayor a 10 Y par: " + (esMayor && esPar));
        System.out.println("Es mayor a 10 O par: " + (esMayor || esPar));
        System.out.println("NO es mayor a 10: " + (!esMayor));
    }
}
