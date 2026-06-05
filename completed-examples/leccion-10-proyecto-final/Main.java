import java.util.Scanner;

class Estudiante{
    private String nombre;
    private String apellido;
    private int nota;

    Estudiante(String nombre, String apellido, int nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    private String validarNota(int nota)
    {
        if(nota>=13)
        {
            return "APROBADO";
        }
        return "DESAPROBADO";
    }

    public void mostrarInformacion()
    {
        String notaFinal = validarNota(this.nota);
        System.out.println("El alumno " + this.nombre + " " + this.apellido + " está: " + notaFinal);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de iteraciones: ");
        int cantidadIteraciones = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cantidadIteraciones; i++) {

            System.out.println("Estudiante ["+(i+1)+"]");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Nota: ");
            int nota = sc.nextInt();
            sc.nextLine();

            Estudiante estudiante = new Estudiante(nombre, apellido, nota);

            estudiante.mostrarInformacion();
        }
    }
}
