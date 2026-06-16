# Script - Lección 5: Estructuras de control

## ¿Qué son las estructuras de control?
Hasta ahora nuestro código se ejecuta línea por línea, de arriba
hacia abajo, sin detenerse. Pero en la vida real necesitamos que
el programa tome decisiones y repita acciones. Para eso existen
las estructuras de control. Hay dos tipos: las condicionales,
que deciden qué hacer, y los bucles, que repiten acciones.

## Condicional: if, else if, else
El if nos permite ejecutar código solo si una condición se cumple.
Por ejemplo, imagina que queremos clasificar la nota de un estudiante:

    int nota = 15;
    if (nota >= 18) {
        System.out.println("Excelente");
    } else if (nota >= 13) {
        System.out.println("Aprobado");
    } else {
        System.out.println("Desaprobado");
    }

Java evalúa de arriba hacia abajo. Primero pregunta: ¿nota es mayor
o igual a 18? No, porque 15 no es mayor o igual a 18. Entonces pasa
al else if: ¿nota es mayor o igual a 13? Sí, 15 sí es mayor o igual
a 13, entonces imprime "Aprobado" y ya no revisa el else.

Si la nota fuera 10, no cumpliría ninguna condición anterior,
así que entraría al else y se imprimiría "Desaprobado". El else
es como decir "si nada de lo anterior se cumplió, haz esto".

## Bucle: for
El for nos permite repetir una acción un número fijo de veces.
Por ejemplo, si tenemos un array de cursos y queremos imprimirlos:

    String[] cursos = {"Matemática", "Programación", "Física", "Inglés"};
    for (int i = 0; i < cursos.length; i++) {
        System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
    }

El for tiene tres partes separadas por punto y coma:
- int i = 0 → donde empieza el contador
- i < cursos.length → hasta cuándo se repite (mientras i sea menor que 4)
- i++ → cuánto avanza el contador en cada vuelta

En cada vuelta, i vale 0, 1, 2 y 3, y accedemos al elemento
correspondiente del array. Cuando i llega a 4, la condición
i < 4 ya no se cumple y el bucle se detiene.

## Bucle: while
El while repite una acción mientras una condición sea verdadera.
A diferencia del for, no tiene un contador fijo integrado,
así que tú controlas cuándo se detiene. Por ejemplo:

    int contador = 5;
    while (contador > 0) {
        System.out.println("Cuenta regresiva: " + contador);
        contador--;
    }
    System.out.println("¡Despegue!");

Aquí el while pregunta en cada vuelta: ¿contador es mayor que 0?
Si sí, imprime el número y le resta 1. Cuando contador llega a 0,
la condición ya no se cumple y el bucle termina.

Muy importante: si te olvidas de poner contador-- el bucle nunca
termina, porque la condición siempre sería verdadera. A esto se
le llama bucle infinito y es un error muy común al empezar con while.

## ¿Cuándo usar for y cuándo while?
Usa for cuando sabes exactamente cuántas veces quieres repetir,
como recorrer un array. Usa while cuando no sabes cuántas veces
se va a repetir y depende de una condición que puede cambiar,
como esperar que un usuario ingrese un dato correcto.
