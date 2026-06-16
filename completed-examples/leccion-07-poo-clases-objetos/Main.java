class Estudiante {
    String nombre;
    int edad;
    String grado;

    Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");
        Estudiante estudiante2 = new Estudiante("Luis", 15, "Cuarto de secundaria");

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}