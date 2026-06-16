# Script - Lección 8: Encapsulación

## Introducción

En la lección anterior creamos una clase Estudiante con atributos, constructor y métodos.

Ahora vamos a mejorar esa clase usando encapsulación.

La encapsulación nos ayuda a proteger los datos de un objeto y controlar cómo se modifican.

## El problema

En la lección anterior los atributos no estaban protegidos.

Eso significa que podríamos cambiar la edad directamente desde el main.

Por ejemplo:

    estudiante1.edad = -5;

El problema es que una edad negativa no tiene sentido.

Para evitar este tipo de datos incorrectos, usamos private.

## Usando private

Ahora los atributos se escriben así:

    private String nombre;
    private int edad;
    private String grado;

La palabra private significa que esos atributos solo pueden usarse directamente dentro de la clase Estudiante.

Desde el main ya no podemos cambiar la edad escribiendo estudiante1.edad.

Por eso necesitamos métodos especiales.

## Getters

Un getter sirve para leer el valor de un atributo privado.

Por ejemplo:

    public int getEdad() {
        return edad;
    }

Este método devuelve la edad del estudiante.

También podemos crear getters para nombre y grado.

## Setters

Un setter sirve para modificar un atributo privado.

Pero lo importante es que podemos controlar qué valores se aceptan.

Por ejemplo:

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no es válida.");
        }
    }

En este caso, la edad solo cambia si el número es mayor que cero.

Si intentamos colocar una edad negativa, el programa muestra un mensaje y no guarda ese valor.

## Prueba en el main

Creamos un estudiante:

    Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");

Luego mostramos su información:

    estudiante1.mostrarInformacion();

Después cambiamos la edad correctamente:

    estudiante1.setEdad(17);

Y finalmente intentamos colocar una edad incorrecta:

    estudiante1.setEdad(-5);

Al ejecutar el programa, veremos que la edad válida sí se guarda, pero la edad negativa no se acepta.

