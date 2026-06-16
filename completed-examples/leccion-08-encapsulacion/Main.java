class Estudiante {
    private String nombre;
    private int edad;
    private String grado;

    Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no es válida.");
        }
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

        estudiante1.mostrarInformacion();

        estudiante1.setEdad(17);
        estudiante1.mostrarInformacion();

        estudiante1.setEdad(-5);
        estudiante1.mostrarInformacion();
    }
}