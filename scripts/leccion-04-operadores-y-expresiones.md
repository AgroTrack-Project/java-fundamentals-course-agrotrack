# Script - Lección 4: Operadores y expresiones

## ¿Qué son los operadores?
Los operadores son símbolos que nos permiten realizar operaciones
con datos. Así como en matemáticas usamos +, -, ×, ÷ para hacer
cálculos, en Java tenemos operadores para calcular, comparar
y combinar condiciones. Hay tres tipos principales que vamos a ver.

## Operadores aritméticos
Son los que ya conoces de matemáticas. Nos permiten hacer cálculos
con números. Por ejemplo, si declaramos dos variables:

    int a = 15;
    int b = 4;

Podemos hacer lo siguiente:
- a + b → 19 (suma)
- a - b → 11 (resta)
- a * b → 60 (multiplicación)
- a / b → 3 (división entera)
- a % b → 3 (residuo de la división)

Ojo con la división: como ambas variables son int, Java devuelve
solo la parte entera. 15 dividido entre 4 da 3.75, pero Java
nos da 3. El operador % nos da el residuo, o sea lo que sobra
de la división. Estos dos son los que más confunden al inicio.

## Operadores relacionales
Estos operadores comparan dos valores y nos devuelven true o false.
Son como preguntas de sí o no. Por ejemplo:

    System.out.println(a > b);   // true, porque 15 es mayor que 4
    System.out.println(a < b);   // false, porque 15 no es menor que 4
    System.out.println(a == b);  // false, porque 15 no es igual a 4

Muy importante: para comparar usamos doble igual ==. Si pones
un solo igual = estás asignando un valor, no comparando. Este es
un error muy común al empezar. También existen >= (mayor o igual),
<= (menor o igual) y != (diferente).

## Operadores lógicos
Estos operadores combinan varias condiciones. Imagina que quieres
saber si un número es mayor a 10 Y además es par. Necesitas que
se cumplan las dos cosas. Para eso usamos los operadores lógicos:

    boolean esMayor = a > 10;   // true
    boolean esPar = a % 2 == 0; // false, porque 15 es impar

- esMayor && esPar → false (AND: las dos deben ser true)
- esMayor || esPar → true (OR: basta con que una sea true)
- !esMayor → false (NOT: invierte el valor)

Piénsalo así: && es exigente, necesita que todo se cumpla.
|| es más flexible, con que una se cumpla ya es suficiente.
Y ! simplemente le da la vuelta al resultado.

## ¿Para qué sirve todo esto?
Los operadores aritméticos los vas a usar cada vez que necesites
hacer un cálculo. Los relacionales y lógicos los vas a necesitar
muchísimo en la siguiente lección cuando veamos las estructuras
de control, porque ahí es donde tu programa toma decisiones
basándose en condiciones como estas.
