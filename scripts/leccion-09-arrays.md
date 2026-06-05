# Script - Lección 9: Arrays

## ¿Qué es un array?
Un array es una lista de datos estática que nos sirve para almacenar
diferentes datos de un mismo tipo, evitando así la creación de múltiples
variables similares. Por ejemplo, si un docente quiere guardar las notas
de sus estudiantes, no tendría sentido crear int nota1, int nota2, int nota3...
Imagina tener 50 alumnos, sería muy tedioso crear 50 variables.
Lo lógico sería usar un array.

## Cómo declarar un array
Se pone el tipo de dato seguido de corchetes para indicar que es un array,
y luego el nombre. Por ejemplo:

    int[] notas = {10, 20, 18, 17};

Los datos se colocan entre llaves separados por comas.

## Posiciones del array
Un array tiene posiciones que empiezan desde 0. Para el array anterior:
- Posición 0 → 10
- Posición 1 → 20
- Posición 2 → 18
- Posición 3 → 17

En total tiene una longitud de 4. Si queremos imprimir un elemento
específico, por ejemplo el 10, usamos notas[0]. Si queremos el 18, usamos notas[2].

## Imprimir todos los elementos con un for
Si el array es grande no vamos a estar escribiendo un System.out.println
por cada elemento. Para eso usamos el ciclo for que ya vimos anteriormente:

    for (int i = 0; i < notas.length; i++) {
        System.out.println(notas[i]);
    }

El .length nos permite obtener la longitud del array, en este caso 4.
La variable i va iterando desde 0 hasta 3, imprimiendo cada elemento.

## Arrays de tipo String
Los arrays no solo funcionan con números, también podemos declarar
arrays de cadenas de texto. Por ejemplo:

    String[] nombres = {"Eduardo", "Miller", "Matías", "Edu", "Joaquín", "Johan"};

Para imprimirlos usamos el mismo for, solo cambiamos el nombre del array.
Importante: cada array tiene su propia longitud, notas tiene 4 elementos
y nombres tiene 6, así que hay que usar la longitud correcta en cada caso.