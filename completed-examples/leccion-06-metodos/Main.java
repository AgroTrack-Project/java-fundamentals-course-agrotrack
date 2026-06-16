// Lección 6: Métodos y parámetros
// Ejemplo completo — ¡así debería verse tu solución!

public class Main {

    // Método 1: saludar
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    // Método 2: mostrarEdad
    public static void mostrarEdad(int edad) {
        System.out.println("Tienes " + edad + " años.");
    }

    // Método 3 (RETO): sumar
    public static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);
    }

    public static void main(String[] args) {

        saludar("Joaquin");
        mostrarEdad(20);
        sumar(8, 5);

    }
}
