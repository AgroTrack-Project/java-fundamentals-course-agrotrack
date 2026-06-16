public class Main {
    public static void main(String[] args) {
        // if, else if, else
        int nota = 15;
        if (nota >= 18) {
            System.out.println("Excelente");
        } else if (nota >= 13) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }

        // Bucle for
        String[] cursos = {"Matemática", "Programación", "Física", "Inglés"};
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
        }

        // Bucle while
        int contador = 5;
        while (contador > 0) {
            System.out.println("Cuenta regresiva: " + contador);
            contador--;
        }
        System.out.println("¡Despegue!");
    }
}
