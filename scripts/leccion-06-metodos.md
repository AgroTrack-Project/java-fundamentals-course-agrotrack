# Script - Lección 6: Métodos y Parámetros

## ¿Qué es un método?

Un método es un bloque de código con nombre que agrupa instrucciones y se puede reutilizar. Imagina que tienes que saludar a 50 estudiantes distintos: sin métodos tendrías que escribir el saludo 50 veces. Con un método lo escribes una vez y lo llamas cuantas veces quieras.

Ya conoces un método: el `main`. Ahora aprenderás a crear los tuyos propios.

## Cómo declarar un método

Se escribe fuera del `main`, pero dentro de la clase. La estructura es la siguiente:

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
}
```

* `public static void` indica que es un método accesible y que no devuelve ningún valor
* `saludar` es el nombre del método, tú lo inventas
* `String nombre` es el **parámetro**: la información que le pasas al método cuando lo usas

## Cómo llamar a un método

Para usar el método, lo llamas desde el `main` escribiendo su nombre seguido del valor entre paréntesis:

```java
public static void main(String[] args) {
    saludar("Carlos");
    saludar("María");
    saludar("Luis");
}
```

Cada llamada ejecuta el método con un nombre diferente. Si el mensaje cambiara, solo modificas el método en un solo lugar y afecta a todas las llamadas.

## Métodos con parámetros numéricos

Los parámetros no solo pueden ser texto, también pueden ser números. Por ejemplo:

```java
public static void mostrarEdad(int edad) {
    System.out.println("Tienes " + edad + " años.");
}
```

Y se llama así:

```java
mostrarEdad(16);
mostrarEdad(14);
```

Un método puede recibir cualquier tipo de dato: `String`, `int`, `double`, entre otros.

## Métodos con más de un parámetro

Un método puede recibir varios parámetros separados por coma. Por ejemplo, un método que suma dos números:

```java
public static void sumar(int a, int b) {
    int resultado = a + b;
    System.out.println("La suma de " + a + " + " + b + " es: " + resultado);
}
```

Se llama pasando los dos valores:

```java
sumar(8, 5);
sumar(20, 30);
```

El método recibe ambos números, calcula la suma y muestra el resultado.

## Puntos clave

* Un método es un bloque de código reutilizable con nombre propio
* Se declara fuera del `main`, pero dentro de la clase
* Los **parámetros** son los datos que le pasas al método al llamarlo
* Puedes llamar al mismo método tantas veces como quieras con distintos valores
* Un método puede recibir uno o varios parámetros de cualquier tipo
