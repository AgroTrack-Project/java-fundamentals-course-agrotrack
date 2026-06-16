# Script - Lección 2: Tu Primer Programa en Java

## ¿Qué es un programa en Java?

Un programa en Java es una serie de instrucciones que le damos a la computadora para que las ejecute una por una, de arriba hacia abajo. Java es uno de los lenguajes más usados en el mundo: sirve para crear aplicaciones móviles, videojuegos, sistemas bancarios y mucho más.

## Estructura básica de un programa

Todo programa en Java empieza con la misma estructura base. Por ahora no necesitas memorizar cada palabra, las irás reconociendo con la práctica:

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

Lo más importante es el método `main`: es el punto de entrada del programa, es decir, Java empieza a ejecutar desde ahí.

## Mostrar texto en pantalla

Para mostrar un mensaje en pantalla usamos `System.out.println()`. Lo que escribas entre comillas dentro del paréntesis es exactamente lo que aparecerá:

```java
System.out.println("Hola, mundo!");
```

Fíjate en el punto y coma al final. En Java, cada instrucción termina con `;`, igual que una oración termina con punto.

## Tu primer programa completo

Así se ve el programa completo con el mensaje "Hola, mundo!":

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

Al ejecutarlo verás en la consola:

```
Hola, mundo!
```

## Mostrar varios mensajes

Puedes escribir tantas líneas de `System.out.println()` como quieras. Cada una imprime una línea nueva:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
        System.out.println("Mi nombre es Ana");
        System.out.println("Tengo 15 años");
    }
}
```

Java ejecuta cada línea en orden, de arriba hacia abajo, mostrando un mensaje por línea.

## Puntos clave

* Todo programa Java tiene una clase principal y un método `main`
* `System.out.println()` muestra texto en pantalla
* El texto que quieras mostrar va entre comillas dobles `"..."`
* Cada instrucción termina con punto y coma `;`
* Puedes usar tantos `println` como necesites, cada uno imprime una línea nueva
